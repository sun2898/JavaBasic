package day01;

public class Operator02 {
	public static void main(String[] args) {
		//2항 연산자
		int i = 7 / 3; // 몫
		int j = 7 % 3; // 나머지
		int k = 7 * 3; // 곱
		
		System.out.println(i); // 2
		System.out.println(j); // 1
		System.out.println(k); // 21
		
		//비교연산 <, <=, ==, >=, >, !=
		
		//비트연산자 &, |, ^
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); // 두 비트가 1일 때 1, 아니면 0 = 0000 0001
		System.out.println(a | b); // 두 비트 중 하나만 1이어도 1, 아니면 0 = 0000 0111
		System.out.println(a ^ b); // 두 비트가 다르면 1, 같으면 0 = 0000 0110
		
		
		
		
	}

}
