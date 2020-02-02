import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemDemo {
	public static void main(String[] args) throws IOException {
//		System.out.print("Hello world");
//		System.out.print("Java Class");
//		System.out.print("Java class");
//		System.out.println("Hello world");
//		double d = 123.0850;
//		System.out.printf("%.2f",d);
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Input your name: ");
//		String name=sc.nextLine();
//		System.out.print("Input your age:");
//		byte age = sc.nextByte();
//		
//		System.out.println("Name: "+name);
//		System.out.println("Age:" +age);
		
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(reader);
		System.out.print("Input your name:");
		String name = buffer.readLine();
		
		System.out.print("Input your age:");
		int age = Integer.valueOf(buffer.readLine());
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
}
