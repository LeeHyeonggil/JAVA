package sec0702;

import sec0701.A;

public class D extends A{
	//������ ����
	public D() {
		//A ������ ȣ��
		super();
	}
	
	//�޼ҵ� ����
	public void method1() {//�ٸ��̸����� �����ؾ� ��밡��
		//A�ʵ� ����
		this.field = "value";
		
		//A�޼ҵ� ȣ��
		this.method();
	}
	
	//�޼ҵ� ����
	public void method2() {
		//����� �޾Ҿ protected ���������ڰ� �ִ� Ŭ������ ���� ��ü�� ����� ��� �� ���� ����.
		//A a = new A();
		//a.field = "value";
		//a.method();
				
	}
}
