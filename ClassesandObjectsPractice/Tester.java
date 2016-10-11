
public class Tester {

	public static void main(String[] args) {
	SavingsAccount myAccount=new SavingsAccount(1000, .1, "Xavier");
	myAccount.addInterest();
	System.out.println(myAccount.seebalance());
	
	Employee Xav=new Employee("Xav", 20000);
	System.out.println(Xav.getName());
	System.out.println(Xav.getSalary());
	Xav.raiseSalary(.1);
	System.out.println(Xav.getSalary());
	
	
	}

}
