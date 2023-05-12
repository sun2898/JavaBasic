package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySwap {

	public static void main(String[] args) {
		//배열의 요소 바꾸기
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//두 수를 입력받아서, 두 수의 위치번쨰를 변경
		
		Scanner scan = new Scanner(System.in);     
		
		
		int a = scan.nextInt(); // 0~9
		int b = scan.nextInt(); // 0~9
		
		int temp = 0;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp; // 연결하면 temp = arr[a] = arr[b] = temp
		
		System.out.println(Arrays.toString(arr));
	}
}
