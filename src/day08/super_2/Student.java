package day08.super_2;

public class Student extends Person{
	
	String studentId;
	
	Student(String name, int age, String studentId) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return super.info() + ", 학번: " + studentId;
	}
	
}