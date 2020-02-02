import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
//		System.out.print("Please input month (1-12):" );
//		Scanner scanner = new Scanner(System.in);
//		byte month = scanner.nextByte();
//		
//		switch(month) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.println("This month has 31 days");
//				break;
//			case 2:
//				System.out.println("This month has 28 or 29 days");
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.print("This month has 30 days");
//				break;
//			default:
//				System.err.print("Invalid month");			
//		}
//		
		char letter = 'S';
		
		switch (letter) {
		case 'a':
		case 'A':
			System.out.print("The first letter");
			break;
		case 'z':
		case 'Z':
			System.out.print("The last letter");
			break;
		default:
			break;
		}
		
		
	}
}
