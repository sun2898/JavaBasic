package day08.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수가 public 상태이면 누구나 값을 변경할 수 있다. (잘못된 값이 입력될 수 있음)
		MyDate me = new MyDate();
		
		me.day = 32;
		me.month = 100;
		me.year = 2002;
		me.ssn = "이게머야!";
		
		me.info();
	}
}
