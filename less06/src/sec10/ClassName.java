package sec10;

public class ClassName {
	//�ν��Ͻ� ���
	int field1;
	void method1() {}
	
	//�������
	static int field2;
	static void method2() {}
	
	//��������
	static {
		//field1 = 10; ������ ����
		//method1(); ������ ����
		field2 = 10;
		method2();
	}
	//�����޼ҵ�
	static void method3() {
		//this.field1 = 10; this ����� �� ����.
		//this.method1();
		field2 = 10;
		method2();
	}
	
	
}