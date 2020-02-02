package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
	public static void test() throws IOException {
		System.out.println("input character:");
		char c = (char)System.in.read();
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
//		int arr[] = {1,2,3};
//		try {
//			for(int i=0;i<5;i++) {
//				System.out.println(arr[i]);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		
//		Student student = new Student();
//		
//		student = null;
//		student.setScore(20);
//		System.out.println(student.getScore());
		
		

//		int i = 1/0;
//		
//		try {
//			test();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Student student = new Student();
		try {
			student.setScore(209);
			System.out.println(student.getScore());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("End of program");
	}
}
