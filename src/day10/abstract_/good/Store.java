package day10.abstract_.good;

public abstract class Store {

	/*
	 * 1. 메서드에 abstract를 붙이면 추상메서드가 된다. (오버라이딩을 강제화 하고 싶을 때)
	 * 2. 추상메서드는 몸체가 없는 메서드 선언이다.
	 * 3. 추상메서드를 쓰고싶다면, 추상클래스가 되어야 한다.
	 * 4. 추상클래스도 메서드, 생성자, 변수 전부 다 가질 수 있다.
	 */
	
	public abstract void apple();
	public abstract void melon();
	public abstract void orange();
	public abstract void grape();
	
	public String name = "호식이 치킨";
	
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	public void newMenu() {
		System.out.println("본점만 가지고 있는 신메뉴");
	}
	
	//name의 getter
	public String getName() {
		return name;
	}
}
