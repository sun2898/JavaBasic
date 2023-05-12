package day08.encap.obj;

public class Hotel {

//	private Chef chef = new Chef(); 매개변수 선언하면서 초기화
	private Chef chef;
	
	public Hotel() {
//		this.chef = new Chef();
	}
	
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//chef의 getter, setter
	//객체를 매개변수로 받는 모형
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	
		
	
}
