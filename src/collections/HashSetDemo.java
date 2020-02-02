package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> animals = new HashSet<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Crocodile");
		animals.add("Elephant");
		
		System.out.println(animals);
		animals.remove("Dog");
		System.out.println(animals);
		animals.add("cow");
		
		Iterator<String> elements = animals.iterator();
		while (elements.hasNext()) {
			System.out.println(elements.next());
		}
	}
}
