package day03;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
	
		//다차원배열 - 매트릭스
		//배열안에 배열이 저장되는 형태
		//int[][]
		
		int[] kor = {10, 20, 30};
		int[] math = {40, 50, 60};
		int[] eng = {70, 80, 90};
		
		int[][] arr = {kor, math, eng};
		
		System.out.println(Arrays.toString(arr[0]));
		
		//2차원 배열의 크기 지정하는 방법
		int[][] arr3 = new int[3][4];
		
		//2차원 배열 모형을 한번에 보는 방법
		System.out.println(Arrays.deepToString(arr3));
		
		//2차원 배열의 순회
		for(int i = 0; i < arr3.length; i++) {
			
		}
		
	}
}
