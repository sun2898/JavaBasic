package day05;

public class PenMain {

	public static void main(String[] args) {
		
		//클래스를 사용하려면 객체를 생성해야 한다
		Pen red = new Pen();
		
		red.color = "빨강";
		red.price = 2000;
		red.company = "빨간펜";
		
		red.write();
		
		Pen black = new Pen();
		
		black.color = "검정";
		black.price = 1500;
		black.company = "모나미";
		
		black.write();
		
		red.info();
		black.info();
		
		
		
		
		
		
	}
}
