package day08.super_2;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "133123");
		System.out.println(s.info());
		
		Teacher t = new Teacher("이순신", 30, "과학");
		System.out.println(t.info());
	}
}
