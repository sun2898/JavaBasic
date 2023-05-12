package day03;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열 삭제의 개념 - 배열에는 삭제가 없다??
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int index = 5; //삭제할 위치
		
		for(int i = index; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		}
}
