package day12.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {
		
		
		//참고
		//메인메서드도 매개변수를 받을 수 있음
		//run > run configuration > argument 탭 > ${string_prompt}

		try {
			
			String a1 = args[0];
			String a2 = args[1];
			
			//정수로 변경
			int num1 = Integer.parseInt(a1);
			int num2 = Integer.parseInt(a2);
			
			System.out.println("두 수의 합: " + (num1 + num2));
			
			String str = null;
			str.charAt(0);
			
		
		//catch문에는 발생할 에러에 대한 정확한 에러클래스를 지정해주어야 한다.	
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남(매개변수를 2개 입력하세요)");
		} catch(NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch(Exception e) {
			System.out.println("기타 예외 입니다.");
		}
		
	}
}
