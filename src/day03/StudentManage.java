package day03;

import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//학생정보를 등록할 배열을 while문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];

		//고객수
		int count = 0;
		//조회할 위치
		int index = 0;

		x:while(true) {

			System.out.println("[정보] 고객수: " + count + ", 조회위치: " + index);
			System.out.println("[메뉴] 1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("=====================================================================");
			System.out.print("메뉴입력: ");
			String menu = scan.next();

			switch (menu) {
			case "1":
				//이름과 성별과 간단한 정보를 입력 받아서 각각의 배열에 순서대로 저장한다.
				//count를 증가한다.
				System.out.print("정보를 추가할 위치: ");
				index = scan.nextInt()-1;
				nameList[index] = scan.next();
				ageList[index] = scan.nextInt();
				infoList[index] = scan.next();
				index++;
				count++;

				break;
			case "2":
				//이전정보 출력
				//정보출력은 index위치로 출력
				//이전정보출력을 누르면 index를 -1시키고 해당위치의 정보를 출력
				//조건: index가 0보다 작다면, 출력하지 않도록 처리

				if(index>1) {
					--index;
					System.out.println(nameList[index-1] + " " + ageList[index-1] + " " + infoList[index-1]);
				} else break;
				break;
			case "3":
				//다음정보 출력
				//다음출력은 index위치로 출력한다.
				//다음정보출력을 누르면 index를 +1시키고 해당위치의 정보 출력
				//count-1 보다 index가 같거나 크다면, 출력하지 않도록 처리
				if(count-1>=index) {
					++index;
					System.out.println(nameList[index-1] + " " + ageList[index-1] + " " + infoList[index-1]);
				}
				break;
			case "4":
				//현재정보 출력
				//index가 가르키고 있는 위치정보를 출력
				//조건: 출력할 수 있는 조건을 생각해보기
				System.out.println("현재 위치: " + index);
				System.out.println(nameList[index-1] + " " + ageList[index-1] + " " + infoList[index-1]);

				break;
			case "5":
				//정보수정
				//새로운 이름, 나이, 정보를 입력받아서 현재위치를 수정해주면 된다.
				//조건: 입력할 수 있는 조건을 생각해보기

				nameList[index-1] = scan.next();
				ageList[index-1] = scan.nextInt();
				infoList[index-1] = scan.next();

				break;
			case "6":
				//현재정보 삭제
				//현재 삭제하려는 index부터 ~~뒤에 있는 배열 요소를 당겨와서 덮어 씌운다
				// 사람수를 감소 (count 감소)
				for(int i = index-1; i<nameList.length-1; i++) {
					nameList[i] = nameList[i+1];
				}
				for(int i = index-1; i<ageList.length-1; i++) {
					ageList[i] = ageList[i+1];
				}
				for(int i = index-1; i<ageList.length-1; i++) {
					ageList[i] = ageList[i+1];
				}
				
				count--;

				break;
			case "7":
				// 종료
				System.out.println("종료합니다.");
				break x;

			default:
			
				break;


			}
		} scan.close();
	}
}
