package day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int[] newArr = new int[6];
		
		int data = 100;
		int targetIndex = 2;
		
		for(int i = 0; i<arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//배열의 추가할 인덱스부터 마지막-1 까지 옮겨담는 작업
		for(int i = newArr.length-1; i > targetIndex; i--) {
			newArr[i] = newArr[i-1];
		}
		
		newArr[2] = data;
		System.out.println(Arrays.toString(newArr));
		
	}
}
