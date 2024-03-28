package ex08;

public class SnowTireExample {

	public static void main(String[] args) {
		 SnowTire snowTire = new SnowTire();
		 Tire tire = snowTire; //자동타입 변환
		 
		 snowTire.run();
		 tire.run();
	}

}
