
public class Company {
private String name;
private Prodect PDP[];
private int nbe;
public Company(String nn, int size) {
	name=nn;
	PDP=new Prodect[size];
	nbe=0;
}
public boolean addProdect(Prodect pp) {
	if(nbe<PDP.length) {
		PDP[nbe]=new Prodect(pp);
		nbe++;
		return true;
	}
	else
		return false;
}
public void display() {
	System.out.println("the name is: "+name);
	for(int i=0; i<nbe; i++) {
		System.out.println(PDP[i]);
	}
}
}
