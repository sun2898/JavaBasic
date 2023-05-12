package day01;

public class Casting02 {

	public static void main(String[] args) {

		//큰 타입을 작은 타입에 넣을 때 소괄호()를 이용하여 강제 형변환을 해준다.
		int i = 70;
		char c =(char)i; //casting
		short s = (short)i;
		
		System.out.println(c); //F
		System.out.println(s); //70
		
		float f = 3.14F;
		int k = (int)f; //casting
		System.out.println(k); // 3
		
		//주의할점 - 타입변환시 값을 받을 수 없는 범위가 들어오면 잘려나간값(trash)을 저장한다.
		int a = 1000;
		byte b = (byte)a;
		System.out.println(b); //-24
		
		//특이케이스 - 문자와 숫자간에도 명시적 형변환이 들어간다.
		char cc = 'A';
		short ss = (short) cc;
		System.out.println(ss); //65
		

		
		
		
	}

}
