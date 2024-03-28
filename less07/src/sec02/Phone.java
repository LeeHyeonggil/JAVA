package sec02;

public class Phone {
	//필드
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;  //미리 초기화
		this.color = color;
	 System.out.println("Phone(String model, String color) 생성자가 실행 됨");	
	}
	
	//생성자 - 기본생성자 Phone(){}
	//메소드
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("나 :" + message);
	}
	public void receoveVoice(String message) {
		System.out.println("상대방 :" + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
