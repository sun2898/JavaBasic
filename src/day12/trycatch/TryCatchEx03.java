package day12.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*
		//next, nextInt, nextDouble, nextLine
		
		System.out.print("정수> ");
		int num = scan.nextInt(); //12엔터 - 엔터기준 앞까지만 받음
		
		scan.nextLine();
		
		System.out.print("문자열> ");
		String info = scan.nextLine(); //ㅌㅌㅌ엔터 - 엔터를 포함해서 받음
		
		System.out.println(num);
		System.out.println(info);
		*/
		
		while(true) {
			try {
				System.out.print("> ");
				int num = scan.nextInt(); //입력: ~~ + enter
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력하시오");
				scan.next(); //or scan.nextLine()
			}
			
		}
	}
}
