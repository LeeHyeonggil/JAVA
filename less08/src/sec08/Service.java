package sec08;

public interface Service {
    //default
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
		staticCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		//private은 구현이 반드시 필요
		System.out.println("defalutMethod 중복 코드A");
		System.out.println("defalutMethod 중복 코드B");
	}
	
	//정적메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속 코드");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");	
		staticCommon();
	}
	
	//private 정적 메소드
	private static void staticCommon() {
		System.out.println("scaticMethod 중복코드 C");
		System.out.println("scaticMethod 중복코드 D");
	}
	
}
