package sec10;

public class Car {
	
		//인스턴스 필드 선언	
	int speed = 0;
	
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	static void simulate() {
		//객체 생성
		Car myCar = new Car();
		
		//인스턴스 멤버 사용
		myCar.speed = 200;
		myCar.run();
	}
	
public static void main(String[] args) {

	simulate();
	
	Car myCar = new Car();
	myCar.speed = 50;
	myCar.run();
	
}
	
}
