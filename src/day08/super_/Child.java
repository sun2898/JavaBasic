package day08.super_;

public class Child extends Parent{

	String me;
	
	//부모class의 기본생성자가 없을 때 오류해결 2가지 방안
	//1. 부모class의 기본생성자를 만든다. (올바른 방법은 아님)
	//2. 자식에서 super()를 통해서 부모class의 생성자와 강제연결한다.	

	Child(String me) {
		super("김유진", "김유경"); // 2번 방법
		this.me = me;
	}
	
	
}
