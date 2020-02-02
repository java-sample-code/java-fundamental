
public class IfDemo {
	public static void main(String[] args) {
		int age = 75;
//		String gender = "Male";
		
		if(age<=18) {
			System.out.println("You are too young. You can not go out.");
		}else if (age<=30) {
			System.out.println("You are adult");
		}else if(age<=50) {
			System.out.print("You are a bit old");
		}else {
			System.out.println("You are too old.");
		}
	}
}
