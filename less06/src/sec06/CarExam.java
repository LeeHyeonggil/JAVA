package sec06;

public class CarExam {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		System.out.println(c1.maxSpeed);
		

		Car c2 = new Car();
		System.out.println(c2.model);
		System.out.println(c2.model);
		System.out.println(c2.color);
		System.out.println(c2.maxSpeed);
		
		Car c3 = new Car("¾Æ¹Ý¶¼", "·¹µå");
		System.out.println(c3.model);
		System.out.println(c3.color);
		

		
		
	}

}
