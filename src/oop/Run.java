package oop;

public class Run {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 1;
		student.name = "Dara";
		student.score = 34;		
		student.address = new Address();
		student.address.streetNo = "222";
		student.info();
		
		Employee employee = new Employee();
		employee.id = 1;
		employee.name = "John";
		employee.salary = 300;
		employee.info();
	}
}
