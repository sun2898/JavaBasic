package day05;

public class Variable {

	int a = 1; //선언과 동기에 초기화는 가능함
	String b;
	
	void printNum(int d) { //d는 매개변수(지역변수와 비슷)
		
		int c = 1; //지역변수는 초기화를 해야 사용 가능
		
		System.out.println("멤버변수: " + a);
		System.out.println("멤버변수: " + b);
		System.out.println("지역변수: " + c);
		System.out.println("지역변수(매개변수): " + d);
	}
	
}
