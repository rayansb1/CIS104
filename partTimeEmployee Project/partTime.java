
public class partTime {
private String Name;
private String Id;
private int[] aray;
private int nbm;
private int size;
public partTime (String Name, String Id, int size) {
	this.Name=Name;
	this.Id=Id;
	aray = new int[size];
	nbm=0;
}
public int addMoney(int Money) {
	if(nbm<aray.length)
	aray[nbm]=Money;
	nbm++;
	return aray[nbm];
}
public boolean deletMoney(int Pos) {
	if(nbm==0)
	{
		return false;}
	else {
	aray[Pos-1]=0;
	aray[Pos-1]=aray[nbm-1];
	nbm--;
	return true;
	}
}
public int theSum() {
	int sum=0;
	for(int i=0; i<nbm; i++) {
		sum+=aray[i];
	}
	return sum;
}
public double sumBounes() {
	double sum=0;
	for(int i=0; i<nbm; i++) {
		sum+=aray[i];
	}
	return sum=(double) (sum+(0.10*sum));
}
public double Bounes() {
	int sum=0;
	
	for(int i=0; i<nbm; i++) {
		sum+=aray[i];
	}
	return ((double) (0.10*sum));
}
public double Average() {
int sum=0;
	for(int i=0; i<nbm; i++) {
		sum+=aray[i];
	}
	if(nbm!=0) {
	return (double) ((sum+(sum*0.10))/nbm);
	}
	else {
		return -1;
	}
}
public void Desplay() {
	System.out.println("Employee Name: "+Name);
	System.out.println("Employee Id: "+Id);
	System.out.print("Employee Money: ");
	for(int i=0; i<nbm; i++) {
	   System.out.print(aray[i]+" ");
	}
	System.out.println();
}

}
