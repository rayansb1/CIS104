
public class Test_partTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    partTime  E1 = new partTime ("Rian","397B74A",30);
    E1.addMoney(100);
    E1.addMoney(300);
    E1.addMoney(800);
    E1.deletMoney(2);
    E1.Desplay();
    System.out.println("The sum for all days: "+E1.theSum());
    System.out.println("The Bounes: "+E1.Bounes());
    System.out.println("The Sum with Bounes: "+E1.sumBounes());
    System.out.println("The Average with Bounes: "+E1.Average());


	}

}
