
public class Test_Bank {

	public static void main(String[] args) {
    Bank A1 = new Bank();
    A1.setName("Rian");
    A1.setAcount(11111111);
    A1.setBalance(111111.1);
    A1.Desplay();
    System.out.println("==================================");
    System.out.println("the name is: "+A1.getName());
    System.out.println("his acount number is: "+A1.getAcount());
    System.out.println("his balance number is: "+A1.getBalance());
    A1.Depost();
    System.out.println("*****************");
    A1.Desplay();
    System.out.println("*****************");
    A1.Withdraw();
	}

}
