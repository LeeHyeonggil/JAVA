package exam132.package2;

import exam132.package1.*;

public class C {
	//�޼ҵ带 ����� �ҷ���
	public void method() {
		//A Ŭ������ ��ü�� ����
		A a = new A();
		
		//a�� �ʵ带 ����
		a.field1 = 11;    //public �ʵ�� �� Ŭ�������� ���氡��
		//a.field2 = 21;    //fefault �ʵ�� �ٸ� ��Ű���̹Ƿ� ���� ����
		//a.field3 = 31;    private �ʵ�� ������ �Ұ���    
		
		//�޼ҵ� ȣ��
		a.method1();
		//a.method2();
		//a.method3();    private �޼ҵ�� �ܺ� Ŭ�������� ������ �Ұ��� 
	}
	public static void main(String[] args) {
		
	}





}



