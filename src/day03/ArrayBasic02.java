package day03;

public class ArrayBasic02 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 길이가 10인 배열
//		
//		int a = 0;
//		while(a < arr.length) {
//			
//			System.out.println("arr의 " + a + "인덱스: " + arr[a]);
//			
//			a++;
//		}
		
		//배열값들의 합
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		System.out.println("arr[] 값들의 합: " + sum);
		
		
		int sum = 0;
		
		int i = 0;
		while(i < arr.length) {
			sum += arr[i];
			i++;
		}
		
		System.out.println("arr[] 값들의 합: " + sum);
	}
}
