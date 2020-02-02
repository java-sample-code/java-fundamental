package collections;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> animals = new TreeSet<>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cow");
		animals.add("Crocodile");
		animals.add("Elephant");
		animals.add("Cow");
		
		TreeSet<String> descendingAnimal = (TreeSet<String>) animals.descendingSet();
		
		System.out.println(descendingAnimal);
		System.out.println(animals);
	}
}
