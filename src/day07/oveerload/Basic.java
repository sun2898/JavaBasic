package day07.oveerload;

public class Basic {
	
	/*
	 * 오버로딩 - 같은이름의 메서드를 여러개 생성하는 것
	 * 
	 * 규칙
	 * 1. 이름은 똑같음
	 * 2. 매개변수를 다르게 해서 모형을 다르게 해야한다.
	 * 3. 반환유형은 오버로딩에 영향을 미치지 않는다. (매개변수가 중요!)
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
		
	}
	
//	int input(int x) {
//		return 0;
//	}
	
	void input(String a) {
		System.out.println("문자열 1개 입력받음");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력받음");
	}
	
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력받음"); // 매개변수 구성이 같더라도 순서가 다르면 가능
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}

}
