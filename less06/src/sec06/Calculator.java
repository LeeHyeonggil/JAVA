package sec06;

public class Calculator {

	//�ʵ����
	//������ �⺻
	
	//�޼ҵ�
	//������ ���� �޼ҵ� ���� void
	void powerOn(){
		System.out.println("������ �մϴ�."); 
	}
	
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int subtract(int x, int y) {
		int result = x - y;
		return result;
	}
	
	double divide(int x, int y){
		double result = (double)x / (double)y;
		return result;
	}
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}



	
}
