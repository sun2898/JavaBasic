package day09.poly.basic;

public class MainClass {

	public static void main(String[] args) {

		Child c = new Child();
		c.method01(); // 상속받은 메소드
		c.method02(); // 오버라이드 된 메소드
		c.method03(); // 클래스 고유 메소드
		
		System.out.println("==========다형성 적용(형변환)===========");
		
		Parents p = c; // 객체의 형변환
		p.method01();
		p.method02(); // 자식의 오버라이드 된 메소드가 먼저 사용됨
//		p.method03(); parents 클래스의 구성에 없으므로 사용 불가능
		

		//초기에 생성된 child의 객체 c는 본래의 형태를 유지하고 있다.
		System.out.println(p); // day09.poly.basic.Child@49e4cb85
		System.out.println(c); // day09.poly.basic.Child@49e4cb85
		System.out.println(p==c); // true
		
		
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		System.out.println("==========다형성 적용(형변환)===========");
		
		
//		Child cc = new Child();
//		Parents pp = cc;
		
		Parents pp = new Child();
		System.out.println(pp); // day09.poly.basic.Child@2133c8f8
		
		Child cc = (Child) pp;
		System.out.println(cc); // day09.poly.basic.Child@2133c8f8
		cc.method01();
		cc.method02();
		cc.method03(); // 강제 형변환을 통해 Child의 기능을 다시 쓸 수 있게 됨
		
		//주의 할 점 => 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
//		Child ccc = (Child)obj; //runtime exception
		
		String str = "홍길동";
		Object o = str;
		String result = (String)o; //ok
		
		
		
		
		
		
		
		
		
		
		
	}
}
