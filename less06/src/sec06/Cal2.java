package sec06;

public class Cal2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		//리턴값이 없는 메소드를 출력
		cal.powerOn();
		
		//리턴값이 있는 메소드를 출력 (리턴값을 받아줄 변수 만듬)
		int rs = cal.plus(120, 15);
		System.out.println("120 + 15=" + rs);
		
		double rs2 = cal.divide(120, 15);
		System.out.println("120 / 15 =" + rs2);
		
		cal.powerOff();
		
		cal.autoCalculator(111,10);
	}

}
