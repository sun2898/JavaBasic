package day04;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		//배열도 매개변수로 전달 할 수 있다
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		method01(arr); // 변수명으로 주면 된다.
		
		//배열은 반환유형으로도 전달 받을 수 있다
		int[] result = method02();
		System.out.println(Arrays.toString(result));
		
	}
	
	static void method01(char[] arr) {
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int[] method02() {
		
		int[] array = new int[3];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		
		return array;	
				}
	
}
