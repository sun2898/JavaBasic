package day08.encap.good;

public class MyDate {

	private int year;
	private int month;
	private int day;
	private String ssn;

	/*
	 * 은닉된 변수에 접근할 때, 미리 생성해놓은
	 * getter/setter를 사용한다.
	 * 
	 * setter메서드
	 * 1. 값을 저장하는 용도의 메서드
	 * 2. 접근제어자는 public으로 선언하고 이름은 'set + 멤버변수명'으로 지정
	 */

	public void setYear(int year) { // 카멜표기법으로 작성
		if(year < 1900 || year > 2023) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		} else
			this.year = year;
	}
	
	/*
	 * getter메서드
	 * 1. 은닉변수의 값을 조회하는 메서드
	 * 2. 접근제어자는 public으로 선언하고 반환유형이 있고, 이름은 'get + 멤버변수명'으로 지정
	 */
	
	public int getYear() {
		return year;
	}
	
	//1. month, day, ssn에 getter/setter생성
	//month - 1~12월까지만 저장
	//day - 1~31일 까지만 저장
	//ssn - 하이픈은 제거하고 13자리까지만 저장 가능 [replace(), length()]
	
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		} else
			this.month = month;
	}
	
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			System.out.println("잘못된 값 입력입니다.");
			return;
		} else
			this.day = day;
	}
	
	public void setSsn(String ssn) {
		ssn = ssn.replace("-","");
		if(ssn.length()!=13) {
			System.out.println("잘못된 값 입력입니다.");
		} else
			this.ssn = ssn;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}


}
