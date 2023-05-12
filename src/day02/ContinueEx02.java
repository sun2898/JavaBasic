package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력> ");
		int n = scan.nextInt();
		int sum = 0;

		x: for(int i = 1; i <= n; i++) {
			int count = 0;
			//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
			// 적절한 시점에서 초기화
			for(int j = 1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
				
				if(count>2) continue x; //약수의 개수가 2개 초과라면 다음 수 확인
			} 
			if(count==2) {
				sum += i;
			}
		} 
		
		System.out.println("합: " + sum);
	}
}
