package sec05;

public class ThrowExceptionSample {
	
	public static void main(String[] args) {
		//���� �������� ��� ����ó���� �� �־�� ��
		try {
			method1();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		//����ó���� �̷������ ������ �׳� �ҷ��� ���� ��.
		method2();
	}
	
	//������ ���� �������� ���ѱ�
    public static void method1() throws ClassNotFoundException {
    	Class.forName("java.lang.String2");
    }
    
    //����ó���� ���� ��.
    public static void method2() {
    	try {
			Class.forName("java.lang.Tnteger2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
