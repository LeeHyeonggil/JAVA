package sec0703;

class A {
	String fieldA;
	void methodA() {
		System.out.println("A�޼ҵ� ���");
	}
}
class B extends A{
	String filedB;
	
	@Override  //�θ�Ÿ�Կ��� �������̵� �ѰͿ� ��µ�
	void methodA() {
		System.out.println("A�޼ҵ带 �������̵��ؼ� ���");
	}
	void methodB() {}
}
class C extends A{}
class D extends B{}
class E extends C{}
public class PromotionExam {

	public static void main(String[] args) {
		
		A b = new B();
		
		b.fieldA = "valueA";
		b.methodA();
		/* �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ�� �Ǹ� �θ�Ŭ������ �ʵ�,�޼ҵ忡 ������ �����ϴ�.
		 * ��� ������ �ڽİ�ü�� ���������� ������ ���� ������ ����� �θ� Ŭ������ �����ȴ�.
		b.fieldB = "valueB";
		b.methodB();
		*/
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;
		//C c2 = d;
	}

}