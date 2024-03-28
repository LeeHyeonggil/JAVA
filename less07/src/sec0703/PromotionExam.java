package sec0703;

class A {
	String fieldA;
	void methodA() {
		System.out.println("A메소드 출력");
	}
}
class B extends A{
	String filedB;
	
	@Override  //부모타입에서 오버라이드 한것에 출력됨
	void methodA() {
		System.out.println("A메소드를 오버라이드해서 출력");
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
		/* 부모타입으로 자동타입변환리 되면 부모클래스의 필드,메소드에 접근이 가능하다.
		 * 비록 변수가 자식객체를 참조하지만 변수로 접근 가능한 멤버는 부모 클래스로 한정된다.
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
