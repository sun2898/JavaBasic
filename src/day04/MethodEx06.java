package day04;

import java.util.Arrays;

public class MethodEx06 {
	
	public static void main(String[] args) {
		
		//Queue - First In First Out (FIFO - 선입선출)
		
		
		int r = pop(); // 삭제된 데이터로 확인이 가능함
		System.out.println("삭제된 데이터: " + r);
		int t = pop();
		System.out.println("삭제된 데이터: " + t);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int[] arr = {1, 2, 3, 4, 5};
	
	static void push(int data) {
		//1. 배열의 크기를 +1 한 새로운 배열 만듦
		int[] temp = new int[arr.length+1];
		
		//2. arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막에 추가
		temp[temp.length-1] = data;
		
		arr = temp;
		temp = null; // temp는 지움
	}
	
	static int pop() {
		if(arr.length > 0) {
			//1. 삭제할 데이터를 백업
			int del = arr[0];
			
			//2. arr보다 -1인 사본배열을 생성
			int[] temp = new int[arr.length - 1];
			
			//3. 원본배열을 사본으로 복사(맨 처음 데이터만 빼고)
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			
			//4. 사본배열을 원본배열로 변경
			arr = temp;
			temp = null;
			
			return del;
		} 
			return 0;
	}

}
