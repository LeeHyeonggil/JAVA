package sec02;

public class SmartPhone extends Phone {
	//�ʵ�
	public boolean wifi;
	//������
	public SmartPhone(String model, String color) {
		super(model, color); //�θ� �̸� �ʱ�ȭ�ּ� ������
		System.out.println("SmartPhone(String model, String color) �����ڰ� ���� ��");	
	}
	//�޼ҵ�
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("���������� ���¸� �����߽��ϴ�.");
	}
	public void internet() {
		System.out.println("���ͳ��� �����մϴ�.");
	}
}
