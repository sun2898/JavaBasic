package day01;

public class Operator04 {

	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a += 3; // a = a + 3
		b =+ 3; // b = +3
		
		System.out.println(a); // 9  
		System.out.println(b); // 3
		
		a -= 4; //5
		a *= 10; //50
		a /= 5; //10
		a &= 2; //0
		
		System.out.println(a); // 0
	}
}
