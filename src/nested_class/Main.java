package nested_class;

public class Main {
	public static void main(String []args) {
		Bank bank1 = new Bank();
		bank1.id = 1;
		bank1.branch = "Phnom Penh";
//		Bank.rate = 10.0f;
		
		Bank bank2 = new Bank();
		bank2.id = 2;
		bank2.branch = "Kandal";
//		Bank.rate = 12.0f;
		
		Bank.findInterest(1000);
		
		System.out.println(Bank.rate);
	}
}
