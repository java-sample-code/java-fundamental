package oop;

public class Employee extends Person{
	float salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
//		Person person = new Person();
//		person.info();
//		super.info();
	}	
	
	@Override
	void info() {
		// TODO Auto-generated method stub
		System.out.println("This method is overried by employee");
		
	}
}
