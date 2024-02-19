package sec10;

public class CalExam {

	public static void main(String[] args) {
		
		double result = 10 * 10 * Calculator.pi;
		System.out.println("반지름이 10인 원의 원주율은" + result + "입니다");
		
		//10 + 5 와 10 - 5를 출력해 보자 plus 메소드와 minus를 출력
		
		//10 * 5 도 출력해 보자 multiply메소드를 출력
		
		int rs1 = Calculator.plus(10, 5);
		int rs2 = Calculator.minus(10, 5);
		System.out.println("10+5:"+rs1);
		System.out.println("10-5:"+rs2);

		Calculator cal = new Calculator();
		int rs3 = cal.multiply(10, 5);
		
		System.out.println(rs3);
		
	}

}
