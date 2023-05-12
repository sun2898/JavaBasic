package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		Chef c = new Chef();
		
		Chef chef = h.getChef();
		
		
		//Chef를 생성해서 Hotel한테 전달
		//Chef chef = new Chef();
//		h.setChef(new Chef());
//		
//		Chef c = h.getChef(); //Hotel안에 있는 chef를 꺼냄
//		
		c.cooking();
		
		
	}
}
