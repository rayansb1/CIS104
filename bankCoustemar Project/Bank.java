import java.util.Scanner;
public class Bank {
private String name;
private int acount;
private double balance;
public Bank(){
	name="";
	acount=0;
	balance=0;
}
public void setName(String nn) {
	name=nn;
}
public void setAcount(int aa) {
	acount=aa;
}
public void setBalance(double bb) {
	balance=bb;
}
//======================================
//=====================================
public Bank(String nn, int aa, double bb) {
	name=nn;
	acount=aa;
	balance=bb;
}
public void Desplay() {
	System.out.println("his name is: "+name);
	System.out.println("his acount number is: "+acount);
	System.out.println("his balance is: "+balance);
}
public String getName() {
	return name;
}
public int getAcount() {
	return acount;
}
public double getBalance() {
	return balance;
}
public void Depost() {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the money");
	double x = input.nextDouble();
	System.out.println("the balance is " +(balance+x));
}
public void Withdraw() {
	Scanner input = new Scanner(System.in);
	System.out.println("enter the money");
	double x = input.nextDouble();
	System.out.println("the balance is " +(balance-x));
}
}