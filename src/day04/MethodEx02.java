package day04;

public class MethodEx02 {

	public static void main(String[] args) {
	
		/*
		 * 매개변수 (parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개 받을 수도 있고, 받지 않을 수도 있다.
		 */
		
		int result = calSum(10);
		System.out.println(result);
		
		int result2 = calSum(100);
		System.out.println(result2);
		
		int result3 = calSum2(1, 2);
		System.out.println(result3);
		
		String result4 = calSum3(5, "가");
		System.out.println(result4);
		
		
	}// main end
	
	//1~매개변수 까지의 합계
 	static int calSum(int a) {

		
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
 	
 	//매개변수 2개 받기
 	static int calSum2(int a, int b) {	
 		return a + b;
 	}
 	
 	// 정수, 문자열을 전달받는 calSum3() 생성
 	static String calSum3(int a, String s) {
 		
 		String str = "";
 		for(int i = 1; i <= a; i++) {
 			str += s;
 		}
 		
 		return str;
 	}
}

