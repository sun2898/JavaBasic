package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀
//		for(int i = 1; i<=10; i++) {
//			if(i == 5) {
//				continue;
//			}
//			
//			System.out.println(i);
//		}
		
		int i = 1;
		while(i <=10) {
			i++;
			if(i==5) {
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
