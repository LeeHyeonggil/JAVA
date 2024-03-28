package exam132.package1;

public class B {
	//메소드를 만들어 불러옴
	public void method() {
		//A 클래스의 객체를 만듬
		A a = new A();
		
		//a의 필드를 변경
		a.field1 = 11;    //public 필드는 이 클래스에서 변경가능
		//a.field2 = 21;    //fefault 필드는 같은 클래스이므로 변경 가능
		//a.field3 = 31;    private 필드는 외부 클래스에서 변경이 불가능    
		
		//메소드 호출
		a.method1();
		a.method2();
		//a.method3();    private 메소드는 외부 클래스에서 변경이 불가능 
	}
}
