package sec10;

public class Car {
	
		//�ν��Ͻ� �ʵ� ����	
	int speed = 0;
	
	//�ν��Ͻ� �޼ҵ� ����
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	static void simulate() {
		//��ü ����
		Car myCar = new Car();
		
		//�ν��Ͻ� ��� ���
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
