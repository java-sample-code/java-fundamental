
public class BreakDemo {
	public static void main(String[] args) {
		
//		for(int i=1;i<=5;i++) {
//			
//			if(i==3) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		outer:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if (i == 3 && j == 3) {
					break outer;
				}
				System.out.println(i + " " + j);
			}
			System.out.println("Finished inner loop");
		}
		
	}
}
