package day09.poly.basic;

/*
 * 하나의 자바파일에는 여러 클래스 선언이 된다.
 * 단, 파일명과 동일한 클래스가 있어야 하고, 해당 클래스만 public이면 된다
 */

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}


public class Basic {

		A a = new A(); // 1
		B b = new B(); // 2
		C c = new C(); // 3
		D d = new D(); // 4
		E e = new E(); // 5
		
		A a5 = new B(); // 1, 2 줄여쓰기 B타입 -> A타입 변환
		
		int x = 1;
		double y = x; // int -> double 변환
		
		//Object타입에는 모든 클래스가 저장 된다 (최상위 클래스이기 때문)
		Object oo1 = a;
		Object oo2 = "문자열";
		Object oo3 = 3;
		Object oo4 = new B();
		
}
