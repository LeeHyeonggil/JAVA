package sec06;

import java.util.Scanner;

public class CalExam2 {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		 Scanner scanner = new Scanner(System.in);
	        
	        boolean keepCalculating = true;
	        
	        while (keepCalculating) {
	            System.out.print("첫 번째 숫자를 입력하세요: ");
	            double num1 = scanner.nextDouble();
	            
	            System.out.print("두 번째 숫자를 입력하세요: ");
	            double num2 = scanner.nextDouble();
	            
	            System.out.print("사칙연산을 선택하세요 (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);
	            
	            double result;
	            
	            switch(operator) {
	                case '+':
	                    result = num1 + num2;
	                    System.out.println("결과: " + result);
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    System.out.println("결과: " + result);
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    System.out.println("결과: " + result);
	                    break;
	                case '/':
	                    if(num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("결과: " + result);
	                    } else {
	                        System.out.println("0으로 나눌 수 없습니다.");
	                    }
	                    break;
	                default:
	                    System.out.println("잘못된 연산자입니다.");
	            }
	            
	            System.out.print("더 계산하시겠습니까? (Y/N): ");
	            char choice = scanner.next().charAt(0);
	            
	            if (choice != 'Y' && choice != 'y') {
	                keepCalculating = false;
	            }
	        }
	        
	        scanner.close();

	}

}
