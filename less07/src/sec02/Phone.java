package sec02;

public class Phone {
	//�ʵ�
	public String model;
	public String color;
	
	public Phone(String model, String color) {
		this.model = model;  //�̸� �ʱ�ȭ
		this.color = color;
	 System.out.println("Phone(String model, String color) �����ڰ� ���� ��");	
	}
	
	//������ - �⺻������ Phone(){}
	//�޼ҵ�
	public void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	
	public void sendVoice(String message) {
		System.out.println("�� :" + message);
	}
	public void receoveVoice(String message) {
		System.out.println("���� :" + message);
	}
	public void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
	
}
