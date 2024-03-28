package sec10;

public class ClassName {
	//인스턴스 멤버
	int field1;
	void method1() {}
	
	//정적멤버
	static int field2;
	static void method2() {}
	
	//정적블록
	static {
		//field1 = 10; 컴파일 에러
		//method1(); 컴파일 에러
		field2 = 10;
		method2();
	}
	//정적메소드
	static void method3() {
		//this.field1 = 10; this 사용할 수 없다.
		//this.method1();
		field2 = 10;
		method2();
	}
	
	
}
