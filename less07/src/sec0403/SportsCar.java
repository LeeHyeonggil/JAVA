package sec0403;

public class SportsCar extends Car{
	
		@Override
		public void speedUp() {
			speed += 10; //Car의 필드를 증가시킴
		}
		/*@Override
		public void stop() {
			System.out.println("스포츠카를 정지시킵니다.");
			speed = 0;
		}*/
			

}
