package sec02;

public class MeasureRunTimeExam {

	public static void main(String[] args) {
		
		//long ti1 = System.currentTimeMillis();
		long ti1 = System.nanoTime();
		long sum = 0;
		for(int i=0; i<=10000000; i++) {
			sum += i;
		}
		long ti2 = System.nanoTime();
		//long ti2 = System.currentTimeMillis();
		
		System.out.println("1���� 10000000 ������ ����" + sum);
		System.out.println("��꿡 �ɸ� �ð��� 0.00" + (ti2 - ti1) + "�� �Դϴ�.");
		
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));

	}

}
