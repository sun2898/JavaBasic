package day08.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
		
		me.setYear(2022);
		
		int year = me.getYear();
		System.out.println(year);
		
		me.setMonth(8);
		me.setDay(2);
		me.setSsn("220802-2874636");
		
		int month = me.getMonth();
		int day = me.getDay();
		String ssn = me.getSsn();
		
		System.out.println("생일: " + month + "월 " + day + "일");
		System.out.println("주민번호: " + ssn);
	}
}
