package day05;

//설계도로 사용 할 클래스는 메인이 없다
public class Pen {
	
	//클래스 속성(값 저장)을 나타낼 때 멤버변수(field)라고 한다
	int price;
	String color;
	String company;
	
	//클래스 안에 기능을 나타낼때, 메서드라고 부른다
	void write() {
		System.out.println(color + "색 글씨를 씁니다");
	}
	
	void info() {
		System.out.println("=====펜의 정보=====");
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
		System.out.println("제조사: " + company);
	}
}
