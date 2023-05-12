package day05;

public class Phone {

	String model;
	String color;
	int price;

	//생성자 생성위치 국룰 : 멤버변수 바로 아래에 적는다
	
	//생성자는 반환유형이 없다
	//역할 - 일반적으로 멤버변수를 초기화하는 용도로 사용
	Phone() {
		System.out.println("생성자 호출! ㅎ");
		model = "Galaxy";
		color = "검정색";
		price = 100000;
	}
	
	//생성자를 여러개 선언하기 위해서는 '매개변수의 종류 or 개수'가 달라야 한다
	Phone(String a) {
		model = a;
		color = "핑크색";
		price = 200000;
	}
	
	Phone(String a, String b) { //모델, 색상
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b) { //모델, 가격
		model = a;
		color = "하얀색";
		price = b;
	}
	
	//model, color, price를 매개변수로 받아서 초기화 하는 생성자
	Phone(String a, String b, int c) {
		model = a;
		color = b;
		price = c;
	}
	
	
	void info() {
		System.out.println("=====폰의 정보=====");
		System.out.println("모델: " + model);
		System.out.println("색상: " + color);
		System.out.println("가격: " + price);
	}
}
