
public class PurchaseGroup {
private String name;
private Prodect[] PRP;
private int nbe;
public PurchaseGroup(String nn, int size) {
	name=nn;
	PRP=new Prodect[size];
	nbe=0;
}
public boolean addProdect(Prodect pp) {
	if(nbe<PRP.length) {
		PRP[nbe]=pp;
		nbe++;
		return true;
	}
	else
		return false;
}
public void display() {
	System.out.println("The name is: "+name);	
	for(int i=0; i<nbe; i++) {
	  System.out.println(PRP[i]);
	  }
}
}
