package sec10;

public class CalExam {

	public static void main(String[] args) {
		
		double result = 10 * 10 * Calculator.pi;
		System.out.println("�������� 10�� ���� ��������" + result + "�Դϴ�");
		
		//10 + 5 �� 10 - 5�� ����� ���� plus �޼ҵ�� minus�� ���
		
		//10 * 5 �� ����� ���� multiply�޼ҵ带 ���
		
		int rs1 = Calculator.plus(10, 5);
		int rs2 = Calculator.minus(10, 5);
		System.out.println("10+5:"+rs1);
		System.out.println("10-5:"+rs2);

		Calculator cal = new Calculator();
		int rs3 = cal.multiply(10, 5);
		
		System.out.println(rs3);
		
	}

}
