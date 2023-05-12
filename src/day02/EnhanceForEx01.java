package day02;

public class EnhanceForEx01 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		for(int i : arr) {
			
			System.out.println(i + "번째");
		}
		
		String[] arr2 = {"가", "나", "다", "라", "마", "바", "사"};
		
		for(String str : arr2) {
			
			System.out.print(str + " ");
		}
		
		int[] score = {50, 40, 30, 20, 10};
		int sum = 0;
		
		for (int i : score) {
			sum += i;
		}
		
		System.out.println(sum);
		System.out.println((double)sum / score.length);
		
		
		
		
	}
}
