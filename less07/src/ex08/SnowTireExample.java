package ex08;

public class SnowTireExample {

	public static void main(String[] args) {
		 SnowTire snowTire = new SnowTire();
		 Tire tire = snowTire; //�ڵ�Ÿ�� ��ȯ
		 
		 snowTire.run();
		 tire.run();
	}

}
