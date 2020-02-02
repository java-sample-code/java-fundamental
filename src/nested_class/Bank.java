package nested_class;

public class Bank {
	int id;
	String branch;
	// Static Data member
	static float rate;
	
	// Static Block
	static{
		rate = 12.5f;
	}
	
	// Static method
	static void findInterest(float deposit) {
		float interest = deposit * rate / 100.0f;
//		System.out.println(branch);
		System.out.println(interest);
	}
}
