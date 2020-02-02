package oop;

public class Person {
	int id;
	String name;
	String gender;
	String dob;
	Address address;	// Composite - Person has an address
	
	void info() {
		System.out.println("This is info method in super class");
	}
}
