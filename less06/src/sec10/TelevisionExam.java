package sec10;

public class TelevisionExam {

	public static void main(String[] args) {
		
		Television tv = new Television();
		
		System.out.println(Television.info);

		Television.method2();
		
		System.out.println(tv.pay);
		
		tv.method1(50000000);
	}

}
