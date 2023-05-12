package day04;

public class MethodEx01 {

	public static void main(String[] args) {
		
	/*
	 * 메서드는 생성과 호출이 있다.
	 * 메서드는 메서드안에서 생성 할 수 없다. (사실 main은 메서드임)
	 *  
	 */

		int result = calSum();
		System.out.println(result);
		
		String result2 = calSum2();
		System.out.println(result2);
		
	} //main end
	
	//반환유형 이름()
	static int calSum() {
		int sum = 0;	
		for(int i = 1; i <= 10; i++) {
			sum+=i;
		}

		return sum;
		
	}

	//문자열 반환
	static String calSum2() {
		
		//A~Z 문자열의 합
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}
	
}


