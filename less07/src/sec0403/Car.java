package sec0403;

public class Car {
	//�ʵ弱��
	public int speed;
	
	//�޼ҵ�
	public void speedUp() {
		speed += 1;
	}
	
	//�ڵ��� ����
	 public final void stop() {
		 System.out.println("�ڵ����� ������ŵ�ϴ�.");
		 speed = 0;
		 }
}