package day01;

public class Bye {
	
	public static void main(String[] args) {
		
		//main이라고 쓰고 ctrl + space를 누르면 실행함수가 만들어진다.
		/*
		 * ctrl + F11 실행
		 * ctrl + s 저장
		 * sysout이라고 쓰고 ctrl + space 출력문 자동완성
		 * 코드복사 : alt + ctrl + 방향키 
		 * 코드이동 : alt + 방향키
		 * 전체정렬 :	ctrl + i
		 * 한줄삭제 : ctrl + d
		 * 	 */
		 
		System.out.println("출력문 자동완성");
		System.out.println("1"); // 문자로 출력된 1
		System.out.println(1); // 숫자로 출력된 1
		
		//자바 출력문의 종류 - 3가지 제공
		
		//1. 개행문자 \n이 없는 print
		System.out.print("hi");
		System.out.print("hi\n");
		System.out.print("hi");
		//system.out.println(""); == system.out.print("\n");
		
		//2. 개행문자를 마지막에 포함해주는 println
		System.out.println("맨 뒤에 줄바꿈이 붙습니다.");
		System.out.println("맨 뒤에 줄바꿈이 붙습니다.");
		
		//3. 형식 지정 출력문 printf
		//출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식
		/* 
		 * %d - 정수를 대입할 수 있음
		 * %f - 실수를 대입할 수 있음
		 * %s - 문자열을 대입할 수 있음
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬(글자포함)
		 */
		
		System.out.printf("제 이름은 %s 입니다\n", "coding404");
		System.out.printf("원주율은 %.2f 입니다\n", 3.14);
		// %.2f -> 소수점 아래 두자리만 표현
		System.out.printf("오늘은 %d일 입니다\n", 7);
		System.out.printf("제 생일은 %d년 %d월 %d일 입니다\n", 1994, 9,2);
		
		
		
		
	}


}
