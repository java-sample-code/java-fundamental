package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> fruits = new Vector<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Coconut");
		System.out.println(fruits);
		
		boolean b = fruits.contains("Apple");
		System.out.println(b);
		
		Enumeration<String> elements = fruits.elements();
		while (elements.hasMoreElements()) {
			String e = elements.nextElement();
			System.out.println(e);
		}
	}
}
