package sec08;

public interface Service {
    //default
	default void defaultMethod1() {
		System.out.println("defaultMethod1 ���� �ڵ�");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 ���� �ڵ�");
		defaultCommon();
		staticCommon();
	}
	
	//private �޼ҵ�
	private void defaultCommon() {
		//private�� ������ �ݵ�� �ʿ�
		System.out.println("defalutMethod �ߺ� �ڵ�A");
		System.out.println("defalutMethod �ߺ� �ڵ�B");
	}
	
	//�����޼ҵ�
	static void staticMethod1() {
		System.out.println("staticMethod1 ���� �ڵ�");
		staticCommon();
	}
	static void staticMethod2() {
		System.out.println("staticMethod2 ���� �ڵ�");	
		staticCommon();
	}
	
	//private ���� �޼ҵ�
	private static void staticCommon() {
		System.out.println("scaticMethod �ߺ��ڵ� C");
		System.out.println("scaticMethod �ߺ��ڵ� D");
	}
	
}
