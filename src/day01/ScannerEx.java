package day01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		//자바의 입력
		//1. 스캐너 객제 필요
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너의 입력기능을 통해 데이터를 입력받음
		System.out.print("이름을 입력하세여> ");
		String name = scan.next(); // 문자열 입력을 받을 수 있는 상태
		
		
		System.out.print("나이를 입력하세여> ");
		int age = scan.nextInt(); // 정수 입력을 받을 수 있는 상태
		
		System.out.print("키를 입력하세여> ");
		double cm = scan.nextDouble(); // 실수 입력을 받을 수 있는 상태
		
		System.out.println("입력받은이름: " + name + ", 나이: " + age + ", 신장: " + cm);
		
		//3. 스캐너 자원해제
		scan.close();
	}
}
