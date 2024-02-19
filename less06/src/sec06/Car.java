package sec06;

public class Car {
	/*
	 * 매개값으로 객체의 필드를 다양하게 초기화 하는 것 - 오버로딩 Overloading
	 * 매개변수를 달리하는 생성자를 여러게 생성하는 것을 '생성자오버로딩'이라고 한다.
	 * 매개변수의 갯수가 같을 때는 타입이 달라야 하고 아니면 매개변수의 개수가 달라야한다.*/
	
	//필드
	String company = "현대자동차";
	String model = "산타페";
	String color = "노랑";
	int maxSpeed = 140;
	
	//생성자
	Car(){
		this("그랜저", "빨강", 300);
	}

	Car(String model, String color){
		this.model = model;
		this.color = color;	
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//메소드
}
