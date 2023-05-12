package day01;

public class DataType2 {

	public static void main(String[] args) {
		
		//단일 문자를 저장하는 char = 2byte
		char c1 = 'A';
		char c2 = 65; //아스키코드
		
		//아스키코드 - 문자에 숫자값을 붙임, 영어와 특수기호만 가능 (1byte)
		//유니코드 - 전세계 문자에 숫자값을 붙임 (2byte - 부호없는 비트체계)
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		System.out.println(c3 + "-" + c4 + "-" + c5); // 가-가-가
		
		//문자열을 저장할 수 있는 String
		String s1 = "가가가가가 "; //공백도 문자열에 포함됨
		String s2 = "나나나나나";
		
		//문자열을 붙일때 +를 사용하면 된다.
		System.out.println(s1 + s2);
		
		//문자열과 다른값에 + 연산
		System.out.println(100 + 100); //200
		
		//문자열에 다른값이 붙으면 문자열이 된다.
		System.out.println("100" + 100); //100100
		System.out.println(100 + 100 + "100"); //200100
		System.out.println(100 + "100" + 100); //100100100
		
		
		
		
		
		
		
	}
}
