package sec0403;

public class Car {
	//필드선언
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//자동차 정지
	 public final void stop() {
		 System.out.println("자동차를 정지시킵니다.");
		 speed = 0;
		 }
}
