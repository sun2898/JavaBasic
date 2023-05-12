package day10.abstract_.good;

public class SeoulStore extends Store {
	
	public void apple() {
		System.out.println("서울지점 사과는 500원");
	}
	
	public void grape() {
		System.out.println("서울지점 포도는 600원");
	}
	
	public void orange() {		
		System.out.println("서울지점 오렌지는 700원");
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론은 700원");

	}
	
	
	
	
}
