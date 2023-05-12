package day06.str_ex;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println("-----------------");
		
		// 같은 메소드 안에 있기 때문에 예외적으로 비교 가능
		System.out.println(str1 == str2);
		
		//직접 생성명령을 내리거나 다른 클래스에서 넘어온 String은 다른 주소를 나타낸다
		System.out.println(str1 == str3);
		
		//문자열 동등 비교시에는 == 대신에 equals() 메소드를 사용해서 비교해야한다
		//null safety
		if(str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
	}
}
