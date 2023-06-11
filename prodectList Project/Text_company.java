
public class Text_company {

	public static void main(String[] args) {
    Company C1 = new Company("AL MARAE",100);
    Prodect p1 = new Prodect("Labnah", 11.3);
    Prodect p2 = new Prodect("Jauce", 2.21);
    Prodect p3 = new Prodect("Laban", 7.0);
    Prodect p4 = new Prodect("Yougert", 1.75);
    PurchaseGroup pg1 = new PurchaseGroup("AL-YAMAMMAH",100);
    PurchaseGroup pg2 = new PurchaseGroup("SULTAN",100);
    C1.addProdect(p1);
    C1.addProdect(p2);
    C1.addProdect(p3);
    C1.addProdect(p4);
    C1.display();
    pg1.addProdect(p1);
    pg2.addProdect(p2);
    pg2.addProdect(p3);
    pg2.addProdect(p4);
    System.out.println("************");
    pg1.display();
    System.out.println("************");
    pg2.display();

    
    
    
    
    
    

	}

}
