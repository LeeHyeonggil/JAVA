package sec12;

public class Service {
	@PrintAno
	public void method01(){
		System.out.println("������̼��� �ִ� ���๮");
	}

	@PrintAno("*")
	public void method2() {
		System.out.println("������̼� ����� �ٲ� ���๮");
	}
	
	@PrintAno(value="#", number=30)
	public void method3() {
		System.out.println("������̼� ���� ���ڸ� �ٲ� ���๮");
	}
}
