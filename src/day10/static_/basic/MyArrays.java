package day10.static_.basic;

public class MyArrays {

	/* Arrays클래스의 toString 메서드 똑같이 만들기
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙인다.
	 * 2. printArray() 메소드를 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도록
	 * 메서드 오버로딩 (String) (int) (char)
	 */

	private MyArrays() {

	}

//	public static void printArray(String[] s) {
//		System.out.print("[");
//		for(int i = 0; i < s.length-1; i++) {
//			System.out.print(s[i] + ", ");
//		} 
//		System.out.print(s[s.length-1] + "]");
//		System.out.println();
//	}
	
	public static String printArray(String[] s) {
		String a = "[";
		for(int i = 0; i <s.length-1; i++) {
		a += s[i];
		a += ", ";
		}
		a += s[s.length-1];
		a += "]";
		return a;
	}

	public static void printArray(int[] n) {
		System.out.print("[");
		for(int i = 0; i < n.length-1; i++) {
			System.out.print(n[i] + ", ");
		} 
		System.out.print(n[n.length-1] + "]");
		System.out.println();
	}

	public static void printArray(char[] c) {
		System.out.print("[");
		for(int i = 0; i < c.length-1; i++) {
			System.out.print(c[i] + ", ");
		} 
		System.out.print(c[c.length-1] + "]");
		System.out.println();
	}
}


