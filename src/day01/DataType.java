package day01;

public class DataType {
	
	public static void main(String[] args) {
		
		//정수형타입
		byte a = 127; //바이트의 단위는 알아두기
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 12312312312312323L;
		
		//2진수, 8진수, 16진수
		int bin = 010; //8진수는 앞에 0을 붙임
		System.out.println("8진수 010은: "+ bin);
		
		int bin2 = 0b111; //2진수는 앞에 0b를 붙임
		System.out.println("2진수 111은: " + bin2);
		
		int hexa = 0xA9; //16진수는 앞에 0x를 붙임
		System.out.println("16진수 A9는: " + hexa);
		
		System.out.println("-----------------------------------");
		
		//실수형타입
		float f1 = 3.14F; //F를 붙여줘야 float형 인식 가능
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
		
		float f2 = 3.1415927777777777f; //7자리까지 유효함
		double d2 = 3.14592777777;		//15자리까지 유효함
				
		System.out.println(f2);
		System.out.println(d2);
	
		System.out.println("-----------------------------------");

		boolean bool1 = true;
		boolean bool2 = false;
		
		
	}
}
