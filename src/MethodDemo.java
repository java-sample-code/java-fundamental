import com.hrd.Demo1;

public class MethodDemo {
	
	// Method
	public void sayHello() {
		String msg = "Hello Java and everybody";
		System.out.println(msg);
	} 
	
	public int sum() {
		int value1 = 10;
		int value2 = 30;
		
		int s = value1 + value2;
		int s1 = s + 20;
		return s1;
	}
	
//	public int sum(int value1, int value2) {
//		int s = value1 + value2;
//		return s;
//	}
//	
	public void sum(int value1, int value2) {
		int s = value1 + value2;
		System.out.println(s);
	}
	
	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		MethodDemo mDemo = new MethodDemo();
		mDemo.sayHello();
		mDemo.sayHello();
//		
//		int result = mDemo.sum();
//		System.out.println(result);
//		
//		Demo1 demo1 = new Demo1();
//		demo1.sum();
//		int result1 = mDemo.sum(10, 30);
//		System.out.println(result1);
//		int result2 = mDemo.sum(40, 50);
//		System.out.println(result2);
//		mDemo.sum(40, 50);
		
	}
}
