package sec0704;

public class CarExam {

	public static void main(String[] args) {
		
		//Car ��ü ����
		Car myCar = new Car();
		
		//Tire ��ü ����
		myCar.tire = new Tire();
		myCar.run();
		
		//�ѱ�Ÿ�̾� ��ü ����
		myCar.tire = new HankookTire();
		myCar.run();
		
		//��ȣŸ�̾� ��ü ����
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
