package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone();
		black.info();
		
		Phone pink = new Phone("아이폰14");
		pink.info();
		
		Phone red = new Phone("TTL", "빨강");
		red.info();
		
		Phone white = new Phone("가로본능", 4000);
		white.info();
		
		Phone blue = new Phone("LG", "파랑", 500000);
		blue.info();
		
	}
}
