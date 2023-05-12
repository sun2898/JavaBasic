package day11.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		
		Animal[] animals = {dog, cat, tiger};
		
		for(Animal ani : animals) {
			ani.eat();
		}
		
		//dog, cat은 Interface타입으로 상호형변환이 된다.
		//dog, cat, goldfish를 저장하고, IPet의 기능을 사용
		IPet[] pets = new IPet[3];
		
		pets[0] = (IPet)dog; // 강제 형변환
		pets[1] = (IPet)cat; // 강제 형변환
//		pets[2] = (IPet)Tiger; //tiger에는 IPet의 기능이 없기 때문에 error발생
		pets[2] = new GoldFish(); // 자동 형변환
	
		for(IPet pet : pets) {
			pet.play();
		}
		
		System.out.println("------------------");
		
		PetHouse.carePet(pets[1]);
		PetHouse.carePet((IPet)dog);
		PetHouse.carePet(pets[2]);
		
	}
}
