
public class SavingsAccount {

	private double balance;
	private String name;
	private double interest;
	
	public SavingsAccount(double b, double i, String n){
	balance=b;
	interest=i;
	name=n;
	}
	public double addInterest(){
	balance=balance*(1+interest);
	return balance;
	}
	public void deposit(double deposit){
	balance=balance+deposit;
	}
	public void withdraw(double withdraw){
	balance=balance-withdraw;	
	}
	public double seebalance(){
	return balance;
	}
}
