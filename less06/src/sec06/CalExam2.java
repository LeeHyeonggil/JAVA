package sec06;

import java.util.Scanner;

public class CalExam2 {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		 Scanner scanner = new Scanner(System.in);
	        
	        boolean keepCalculating = true;
	        
	        while (keepCalculating) {
	            System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
	            double num1 = scanner.nextDouble();
	            
	            System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
	            double num2 = scanner.nextDouble();
	            
	            System.out.print("��Ģ������ �����ϼ��� (+, -, *, /): ");
	            char operator = scanner.next().charAt(0);
	            
	            double result;
	            
	            switch(operator) {
	                case '+':
	                    result = num1 + num2;
	                    System.out.println("���: " + result);
	                    break;
	                case '-':
	                    result = num1 - num2;
	                    System.out.println("���: " + result);
	                    break;
	                case '*':
	                    result = num1 * num2;
	                    System.out.println("���: " + result);
	                    break;
	                case '/':
	                    if(num2 != 0) {
	                        result = num1 / num2;
	                        System.out.println("���: " + result);
	                    } else {
	                        System.out.println("0���� ���� �� �����ϴ�.");
	                    }
	                    break;
	                default:
	                    System.out.println("�߸��� �������Դϴ�.");
	            }
	            
	            System.out.print("�� ����Ͻðڽ��ϱ�? (Y/N): ");
	            char choice = scanner.next().charAt(0);
	            
	            if (choice != 'Y' && choice != 'y') {
	                keepCalculating = false;
	            }
	        }
	        
	        scanner.close();

	}

}
