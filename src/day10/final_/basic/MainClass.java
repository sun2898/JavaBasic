package day10.final_.basic;

public class MainClass {

	public static void main(String[] args) {

		Person p1 = new Person("123123", "홍길동");
		System.out.println(p1.ssn);
		
		Person p2 = new Person("234234", "이순신");
		System.out.println(p2.ssn);
		
		System.out.println(Contant.DOMAIN);
		System.out.println(Contant.EARTH_RADIUS);
		System.out.println(Contant.O2);
		System.out.println(Contant.VERSION);
		
		
		
	}

}
