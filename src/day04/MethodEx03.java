package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * return이란
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. '리턴이 있는 메서드'는 메서드의 매개값으로도 사용이 된다
		 * 3. 반환값은 없을 수도 있다. >> void로 선언
		 */
		
		add(1, 2);
		System.out.println(add(1, 2));
		int result = add(add(1, 2), add(3, 5)); // 가장 안쪽에 있는 메소드 부터 수행한다
		//1. add(1, 2) = 3, add(3, 5) = 8
		//2. add(3, 8) = 11
		System.out.println(result);
		
		// System.out.println(sub()) >> 리턴이 없기 때문에(X)
		sub(); // 단순히 호출만 가능함
		
		div(6, 2);
		
	} //main end
	
	static int add(int a, int b) {
		
		return a + b;
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() { //리턴값이 없으므로 단순 호출만 가능
		System.out.println("5 - 3 = 2");
	}
	
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
 

}
