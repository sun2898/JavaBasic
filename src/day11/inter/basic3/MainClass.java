package day11.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		Printed pt = new LG();		
		
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result = pt.copy(5);
		
		Printed pt2 = new Samsung();
		pt.print("hello world");
		pt.colorPrint("hello world2", "파란색");
		int result2 = pt2.copy(5);
		
	}
}
