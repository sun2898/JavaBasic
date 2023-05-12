package day10.abstract_.good;

public class BusanStore extends Store{

	@Override
	public void apple() {
		System.out.println("부산지점 사과는 200원");
		
	}

	@Override
	public void melon() {
		System.out.println("부산지점 멜론은 300원");
		
	}
	@Override
	public void orange() {
		System.out.println("부산지점 오렌지는 400원");
	}

	@Override
	public void grape() {
		System.out.println("부산지점 포도는 500원");
	}

}
