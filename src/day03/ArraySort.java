package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열 정렬 - 알고리즘
		//선택정렬 - 작은값을 앞으로 가져온다
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		
		//반복할때 시작값이 바뀌는 형태이다
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j <arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		} 
		
		System.out.println(Arrays.toString(arr));
	} 
}
