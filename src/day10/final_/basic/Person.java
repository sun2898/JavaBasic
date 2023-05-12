package day10.final_.basic;

public final class Person {
	
	//final 변수는 반드시 초기화를 한다. final 키워드를 제거해도 프로그램 실행해는 큰 문제가 없다.
	// 1) 생성자를 통한 초기화 / 2) 직접 초기화
	public final static String nation = "대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		
		this.ssn = ssn;
		this.name = name;	
	}

}
