package day10.static_.singleton;

public class MainClass {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance(); 
		Singleton s1 = Singleton.getInstance(); 
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s); //day10.static_.singleton.Singleton@7c30a502
		System.out.println(s1);//day10.static_.singleton.Singleton@7c30a502
		System.out.println(s2);//day10.static_.singleton.Singleton@7c30a502
		
		System.out.println(s.getDomain()); //www.aaa.com
		System.out.println(s1.getDomain());//www.aaa.com
		System.out.println(s2.getDomain());//www.aaa.com
		
		//공통된 객체 1개로부터 불러오는 것이므로 모든 값이 다 동일하다
	}
}
