
public class Company {
private String name;
private Prodect[] Arr;
private int nbe;
public Company(String nn, int size) {
	name=nn;
	Arr=new Prodect[size];
	nbe=0;
}
public boolean IncertProdect(Prodect pp) {
	if(nbe<Arr.length) {
		Arr[nbe]=pp;
		nbe++;
		return true;
	}
	else {
		return false;
	}
}
public boolean DeleteProdect(Prodect pp) {
	for(int i=0; i<nbe; i++) {
		if(Arr[i].getName().equals(pp.getName()))
			if(Arr[i].getType().equals(pp.getType()))
				if(Arr[i].getPrice()==pp.getPrice())
					Arr[i]=Arr[nbe-1];
		            Arr[nbe-1]=null;
		            nbe--;
		            return true;
				
	}
	return false;
}
public boolean DeleteProdectByName(String nn) {
	for(int i=0; i<nbe; i++) {
		if(Arr[i].getName().equals(nn))
					Arr[i]=Arr[nbe-1];
		            Arr[nbe-1]=null;
		            nbe--;
		            break;				
	}
    return true;
}
public boolean DeleteProdectByType(String tt) {
	for(int i=0; i<nbe; i++) {
		if(Arr[i].getType().equals(tt))
					Arr[i]=Arr[nbe-1];
		            Arr[nbe-1]=null;
		            nbe--;
		            return true;
				
	}
	return false;
}
public int CountNumberOf(String nn) {
	int count=0;
	for(int i=0 ;i<nbe; i++) {
		if(Arr[i].getName().equals(nn))
		count++;
	}
	return count;
}
public void Display() {
	System.out.println("NAME OF COMPANY: "+name);
	for(int i=0 ;i<nbe; i++) {
		System.out.println(Arr[i].toString());
	}
}
}
