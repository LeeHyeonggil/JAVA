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
		
		System.out.println("1부터 10000000 까지의 합은" + sum);
		System.out.println("계산에 걸린 시각은 0.00" + (ti2 - ti1) + "초 입니다.");
		
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));

	}

}
