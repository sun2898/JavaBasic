package day07.override01;

public class MainClass {

	public static void main(String[] args) {
		
		Parents p = new Parents();
		p.method01(); // 본인 메서드
		p.method02(); // 본인 메서드
		
		Child c = new Child();
		c.method01(); // 상속받은 메서드
		c.method02(); // 오버라이드 한 메서드
	}
}
