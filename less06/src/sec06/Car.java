package sec06;

public class Car {
	/*
	 * �Ű������� ��ü�� �ʵ带 �پ��ϰ� �ʱ�ȭ �ϴ� �� - �����ε� Overloading
	 * �Ű������� �޸��ϴ� �����ڸ� ������ �����ϴ� ���� '�����ڿ����ε�'�̶�� �Ѵ�.
	 * �Ű������� ������ ���� ���� Ÿ���� �޶�� �ϰ� �ƴϸ� �Ű������� ������ �޶���Ѵ�.*/
	
	//�ʵ�
	String company = "�����ڵ���";
	String model = "��Ÿ��";
	String color = "���";
	int maxSpeed = 140;
	
	//������
	Car(){
		this("�׷���", "����", 300);
	}

	Car(String model, String color){
		this.model = model;
		this.color = color;	
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//�޼ҵ�
}
