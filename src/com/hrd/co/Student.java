package com.hrd.co;

public class Student {
	private int id;
	private String name;
	private int score;
	
	public Student() {
//		id = 1;
//		name = "Dara";
//		score = 90;
		System.out.println("This is default constructor.");
	}
	
	public Student(int id) {
		this();
		System.out.println(id);
	}
	
	public Student(int id, String name, int score) {
		this(23);
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	public void showInfo() {
		System.out.println("id:"+id+"\tname:"+name+"\tscore:"+score);
	}
	
	public static void main(String[] args) {
//		Student student = new Student();
//		student.showInfo();
		
		Student student2 = new Student(2, "John Doe", 100);
		student2.showInfo();
	}
}