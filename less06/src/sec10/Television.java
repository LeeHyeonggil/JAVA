package sec10;

public class Television {
//���̺귯�� Ŭ��
	
	//���� ����ȿ��� �ν��Ͻ� ����� ����� �� ����.
	
	//�ν��Ͻ� ���
	int pay = 20000000;
	String color;
	
	//���� ���
	static String company = "LG";  //�����ʵ�� �Ϲ������� �ٷ� �ʱ�ȭ�� �Ѵ�.
	static String model = "OLED";
	static String info; //�ʵ�
	//�����ʵ����� �̿���
	static {
		info = company + "-" + model; //��������� �����ϴ� ���
	}
	
	
	void method1(int getPay) {           //�ν��Ͻ��޼ҵ�
 		this.pay = getPay;
		this.color = "����";
				System.out.println(this.pay + "," + this.color + info);  //���� �����޼ҵ带 ���°��� �����ϴ�
	}
	
	static void method2() {    //���� �޼ҵ�
		System.out.println(info);  
	}
	
	
	
}
