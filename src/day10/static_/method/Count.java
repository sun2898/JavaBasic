package day10.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메서드 - 일반멤버변수와 정적멤버변수 모두 사용이 가능
	public int method01() {
		
		 a = 10;
		 b++;
		 return b;
	}
	
	//정적 메서드 - 일반멤버변수를 사용할 수 없음, 정적멤버는 사용가능
	public static int method02() {
//		a = 10; //사용 불가 static이 생성될 당시에 a변수 없음
		Count c = new Count();
		c.a = 10; // 직접 객체를 생성해서 사용가능
		b++;
		return b;
	}
	

}
