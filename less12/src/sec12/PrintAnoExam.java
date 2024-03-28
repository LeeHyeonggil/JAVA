package sec12;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnoExam {

	public static void main(String[] args) {
		
		Method[] delclareMethods = Service.class.getDeclaredMethods();
		for(Method method : delclareMethods) {
			//PrintAno ���
			PrintAno pAno = method.getAnnotation(PrintAno.class);
			
			//���� ������ �̿��ؼ� �� ���
			printLine(pAno);
			try {
				method.invoke(new Service());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			printLine(pAno);
		}

	}

	private static void printLine(PrintAno pAno) {
		if(pAno != null) {
		    //number �Ӽ� ���
			int number = pAno.number();
			for(int i=0; i<number; i++) {
				//value �Ӽ� ���
				String value=pAno.value();
				System.out.print(value);
			}
			System.out.println();
		}
		
	}

}
