package day11.inter.basic;

public interface Inter1 {
	
	int A = 10;
	//메서드를 선언하면 자동으로 추상메서드가 된다.
	void method01();
	
	//인터페이스에서 static, default 메서드 선언이 가능함
	public static void method3() {
		System.out.println("스테틱 메서드");
	}
	
	public default void method4() {
		System.out.println("디폴트 메서드");
	}
}
