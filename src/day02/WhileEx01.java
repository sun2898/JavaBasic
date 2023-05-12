package day02;

public class WhileEx01 {

	public static void main(String[] args) {
		
		int a = 1; //제어변수: 반복문의 조건을 제어할 변수
		int sum = 0; // 값을 누적할 변수
		
		while(a<=10) {
			
			sum += a; //sum = sum + a;
			
//			System.out.println(a);
			
			a++;			
		}
		
		System.out.println("1-10까지 합: " + sum);
	}
}
