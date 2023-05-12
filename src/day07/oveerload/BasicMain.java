package day07.oveerload;

public class BasicMain {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(3);
		b.input("안녕");
		b.input(1, 5.2);
		b.input(3.8, 6);
		b.input(9,'ㅋ',4.3);
		
	}
}
