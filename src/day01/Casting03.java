package day01;

public class Casting03 {

	public static void main(String[] args) {
		
		char c = 'C';
		int i = 2;
		
		//1. 서로 다른 타입의 연산이면 큰 타입에 맞추어 자동 형변환 된다.
		char cc = (char)(c + i);
		System.out.println(cc); // e
		int ii = c + i;
		System.out.println(ii);
		
		//2. int형보다 작은 타입의 연산의 결과는 무조건 int
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);
		
		short s1 = 100;
		byte b = 10;
		short s2 = (short)(s1 + b); //int
		
		
		
		
		
	}

}
