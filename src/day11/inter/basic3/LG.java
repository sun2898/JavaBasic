package day11.inter.basic3;

public class LG implements Printed{

	private String logo = "Life is good";

	@Override
	public void print(String document) {
		System.out.println(logo);
		System.out.println(document);
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(logo);		
		System.out.println("color : " + color);
		System.out.println(color + " " + document);
	}

	@Override
	public int copy(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("프린트" + n + "장");
		}
			
		return 1;
	}
	
	
}
