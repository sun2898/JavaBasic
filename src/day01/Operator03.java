package day01;

public class Operator03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 뒤에 소괄호가 true 일때 중괄호 실행, false라면 else문 실행
		if( x != 10 & ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다."); // 거짓 입니다.
			
		}
		
		System.out.println("x값: " + x ); // 10
		System.out.println("y값: " + y ); // 21
		
		if(x == 10 | ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다."); // 참 입니다.
			
		}
		System.out.println("x값: " + x ); // 10
		System.out.println("y값: " + y ); // 22
		
		System.out.println("-----------------------");
		
		x = 10;
		y = 20;
		
		if( x != 10 && ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다."); // 거짓 입니다.	
		}
		
		System.out.println("x값: " + x ); // 10
		System.out.println("y값: " + y ); // 20 (&& 앞쪽이 false였기 때문에 y연산을 수행하지 않음)
		
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다."); // 참 입니다.
		}
		
		System.out.println("x값: " + x ); // 10
		System.out.println("y값: " + y ); // 20 (&& 앞쪽이 true였기 때문에 y연산을 수행하지 않음)
		
	}
}
