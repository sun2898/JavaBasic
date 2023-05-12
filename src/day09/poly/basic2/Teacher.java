package day09.poly.basic2;

public class Teacher extends Person{
	
	String subject;
	
	Teacher(String name, int age, String subject) {
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 담당과목: " + subject;
	}
	
}
