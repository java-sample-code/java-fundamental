
public class ArrayDemo {
	public static void main(String[] args) {
//		int array[] = new int[5];
//		
//		array[0] = 10;
//		array[1] = 15;
//		array[2] = 30;
//		array[3] = 45;
//		array[4] = 50;
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
//		String[] fruits = {"Apple", "Banana", "Mango", "Coconut"};
//		
//		System.out.print(fruits[2] + " " + fruits[0] );
		
		int[][] arr = new int[2][3];
		
		arr[0][0] = 10;
		arr[0][1] = 15;
		arr[0][2] = 20;
		
		arr[1][0] = 35;
		arr[1][1] = 40;
		arr[1][2] = 50;
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		for(int[] row:arr) {
			for(int col:row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		
		String[] fruits = {"Apple", "Banana", "Mango", "Coconut"};
		
		for(String f:fruits) {
			System.out.println(f);
		}
		
		
		
		
		
		
		
	}
}
