package day09.poly.basic2;

public class Person {

	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
//		System.out.println(this.info());
	}
	
	Person(String name) {
//		this.name = name;
//		this.age = 1;
//		System.out.println(this.info());
		this(name, 1);
	}
	
	Person() {
//		this.name = "이름없음";
//		this.age = 1;
//		System.out.println(this.info());
		this("이름없음");
	}
	
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
}
