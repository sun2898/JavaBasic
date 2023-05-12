package day04;

import java.util.Arrays;

public class StringManiqulation {

	public static void main(String[] args) {
		
		//문자열다루기
		//문자열은 사실 배열이다!! 문자열은 인덱스가 있다.
		
		String str = "안녕하세요~ 영어로 하면 하이!";
		
		//System.out.println( str[0] ); //안된다~~
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//입력한 위치에 해당하는 문자열 한개를 반환
		char c = str.charAt(3);
		System.out.println(c); // 세
		
		//문자열의 위치 확인 indexOf, lastIndexOf
		int idx = str.indexOf("야");
		System.out.println("문자의 위치: " + idx); // 3 (앞에서부터 검색했을 때 해당 문자가 나온 위치)
		// 없는 문자열을 입력하면 -1이 출력 됨 = indexOf의 값이 -1이라면 해당 문자는 문자열에 존재하지 않는다.
		
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은위치: " + idx2);
		
		//문자열 변환 
		//toUpperCase() : 대문자로 변환 / toLowerCase() : 소문자로 변환 (영어일때만 사용 가능)
		String s1 = "abcDEF";
		
		String result = s1.toLowerCase();
		System.out.println(result); // abcdef
		
		String result2 = s1.toUpperCase();
		System.out.println(result2); // ABCDEF
		System.out.println(s1); // abcDEF (원본 문자열은 변하지 않는다)
		
		System.out.println("---------------------------------------------------");
		
		//문자열 변경 - replace
		String s2 = "abcdefaaa";
		String result3 = s2.replace("a", "x");
		System.out.println(result3);
		System.out.println(s2); //abcdefaaa (원본 문자열은 변함없음)
		
		 String result4 = s2.replaceFirst("a", "x");
		 System.out.println(result4); // xbcdefaaa (문자열에서 첫번째로 해당하는 문자만 변환)
		 
		 System.out.println("---------------------------------------------------");

		 //공백제거 trim
		 String str2 = "  010-1111-2222   ";
		 String result5 = str2.trim(); //앞뒤 공백을 제거해서 반환
		 System.out.println(result5);
		 str2 = result5;
		 
		 String str3 = " 안녕 하세요? 오늘은 4월 19일 입니다  ";
		 System.out.println(str3.trim()); // 문자열 사이에 있는 공백은 제거 못함
		 String result6 = str3.replace(" ", ""); // 공백을 아무것도 없는 상태로 대체
		 System.out.println(result6); //안녕하세요?오늘은4월19일입니다 - 모든 공백 제거(원본은 변함없음)
		 str3 = result6; // 원본 변경
		 
		 System.out.println("---------------------------------------------------");
		 
		 //문자열 자르기 - substring (인덱스 기준으로 자름, n번 인덱스 미만 절삭)
		 //사용방법 2가지
		 //1. 매개변수 1개
		 String result7 = str2.substring(9); // 원본문자열 변함없음
		 System.out.println(result7); // 2222
		 
		 //2. 매개변수 2개
		 String result8 = str2.substring(4, 8); // 4 <= st2 < 8
		 System.out.println(result8); // 1111, 원본 변함없음
		 
		 //split() - 특정문자를 기준으로 자른 후 배열로 반환 (정규표현식 개념을 제대로 알아야 잘 쓸 수 있음)
		 String[] arr = str2.split("-");
		 System.out.println(Arrays.toString(arr)); // [010, 1111, 2222]
		 
		 String[] arr2 = str2.split("");
		 System.out.println(Arrays.toString(arr2)); // [0, 1, 0, -, 1, 1, 1, 1, -, 2, 2, 2, 2]
		 
		 //toCharArray - 한글자씩 잘라서 char배열로 반환
		 char[] arr3 = str2.toCharArray();
		 System.out.println(Arrays.toString(arr3)); // [0, 1, 0, -, 1, 1, 1, 1, -, 2, 2, 2, 2]
		 
		 System.out.println("---------------------------------------------------");
		 
		 //문자열의 길이 - length()
		 String str4 = "안녕하세요";
		 int len = str4.length();
		 System.out.println("문자열길이: " + len);
		 
		 //문자열의 비교 - equals() - 무족권 외워라ㅋㅋㅋ
		 str.equals(str4);
		 if(str4.equals("안녕하세요")) {
			 System.out.println("두 문자가 같음");
		 }
		 
		 //문자열의 포함여부 contains()
		 if(str4.contains("녕")) {
			 System.out.println("해당 문자가 포함되어 있음");
		 }
		 
		 
	}
}
