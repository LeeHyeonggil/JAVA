package sec06;

public class Cal2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		//���ϰ��� ���� �޼ҵ带 ���
		cal.powerOn();
		
		//���ϰ��� �ִ� �޼ҵ带 ��� (���ϰ��� �޾��� ���� ����)
		int rs = cal.plus(120, 15);
		System.out.println("120 + 15=" + rs);
		
		double rs2 = cal.divide(120, 15);
		System.out.println("120 / 15 =" + rs2);
		
		cal.powerOff();
		
		cal.autoCalculator(111,10);
	}

}
