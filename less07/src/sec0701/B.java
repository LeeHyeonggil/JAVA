package sec0701;

public class B {
	/*
	 * ���������� protected�� ���� ��Ű�� �������� public, default�� ���� �����Ӱ� ����� �����ϴ�.*/
	//�޼ҵ� ����
	public void method() {
	A a = new A(); //���� ��Ű�� �ȿ��� protected�� ��� ����
	a.field = "value";
	a.method();
	}
}
