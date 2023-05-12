package day02;

import java.util.Scanner;

public class WhileEx4 {

	public static void main(String[] args) {
		
		/*
		 * 입력을 받을 횟수를 지정
		 * 처음 5를 입력받으면
		 * 5번 입력받을 수 있도록 처리
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 번 반복? : ");
		int size = scan.nextInt();
		int a = 1;
		int sum = 0;
		
		while(a<=size) {
			System.out.print("> ");
			int b = scan.nextInt();
			sum += b;
			a++;
		}
		System.out.println("합: " + sum);
	}
}
