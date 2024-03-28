package sec02;

public class SmartPhone extends Phone {
	//필드
	public boolean wifi;
	//생성자
	public SmartPhone(String model, String color) {
		super(model, color); //부모가 미리 초기화애서 가져옴
		System.out.println("SmartPhone(String model, String color) 생성자가 실행 됨");	
	}
	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이의 상태를 변경했습니다.");
	}
	public void internet() {
		System.out.println("인터넷을 연결합니다.");
	}
}
