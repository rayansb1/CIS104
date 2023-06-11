
public class Test_Company {

	public static void main(String[] args) {
    Company C1 = new Company("AL-KHIAR Al-AFDAL",1000);
    Prodect P1 = new Prodect("كلبس صني 2011","كلبس",0.8);
    P1.AddVAT();
    Prodect P2 = new Prodect("كلبس صني 2011","كلبس",0.8);
    P2.AddVAT();
    Prodect P3 = new Prodect("كلبس تاهو 2013","كلبس",0.8);
    P3.AddVAT();
    Prodect P4 = new Prodect("صدام صني خلفي2007 ","صدام",370);
    P4.AddVAT();
    Prodect P5 = new Prodect("صدام اكسنت خلفي 2017","صدام",370);
    P5.AddVAT();
    Prodect P6 = new Prodect("شمعة يسار يارس 2008","شمعة",250);
    P6.AddVAT();
    Prodect P7 = new Prodect("شمعة يمين يارس 2008","شمعة",250);
    P7.AddVAT();
    Prodect P8 = new Prodect("مرايه يمين كامري 2020","مرايه",600);
    P8.AddVAT();
    Prodect P9 = new Prodect("باب يسار خلفي اكسنت 2019","باب",1700);
    P9.AddVAT();
    Prodect P10 = new Prodect("باب يسار خلفي اكسنت 2019","باب",1500);
    P10.AddVAT();
    C1.IncertProdect(P1);
    C1.IncertProdect(P2);
    C1.IncertProdect(P3);
    C1.IncertProdect(P4);
    C1.IncertProdect(P5);
    C1.IncertProdect(P6);
    C1.IncertProdect(P7);
    C1.IncertProdect(P8);
    C1.IncertProdect(P9);
    C1.IncertProdect(P10);
    C1.Display();
    System.out.println(C1.CountNumberOf("باب يسار خلفي اكسنت 2019"));
    C1.DeleteProdectByName("باب يسار خلفي اكسنت 2019");
    C1.Display();
    System.out.println(C1.CountNumberOf("باب يسار خلفي اكسنت 2019"));

    
	}

}
