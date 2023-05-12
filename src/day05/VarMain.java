package day05;

public class VarMain {
	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		var.printNum(10);
		
		var.a = 10;
		var.b = "바꾸기 가능";
		
		var.printNum(5);

	}
}
