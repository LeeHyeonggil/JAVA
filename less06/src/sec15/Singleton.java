package sec15;

public class Singleton {
	//�ʵ�� private ���� ������ ���� ���� �ʵ� �������� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	//�����ڴ� private�� �ܺ� ������ ����
	private Singleton() {
		String str = "�̱��水ü";
	}
	
	//public ������ ���� �޼ҵ带 ����� �ʵ带 ���
	public static Singleton getInstance() {
		return singleton;
	}
}
