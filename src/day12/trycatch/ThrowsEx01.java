package day12.trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws
		 * throws구문이 붙어 있는 생성자 or 메서드는 호출문장에서 예외처리를 진행해야 한다.
		 * 
		 * 즉, 예외처리를 강요할 때 사용된다.
		 */

		try {

			greeting(5);
			
		} catch (Exception e) {
			
			System.out.println("에러가 발생했습니다.");
			e.printStackTrace(); // 에러가 발생했을 때 에러로그를 확인하기 위해 사용하는 메서드
		}
			
		//throws의 예시 - 메서드
		try {
			Class.forName("@#$%^@#$");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// throws의 예시 - 생성자
		try {
			new FileInputStream("@#$");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료");			
	}
	
	private static String[] arr = {"hello", "bye", "say good bye"};
	
	public static void greeting(int index) throws Exception {
		System.out.println(arr[index]);
	}
	
}
