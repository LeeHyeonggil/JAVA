package sec08;

public class ArrExam {

	public static void main(String[] args) {
		
		ArrMethod arrs = new ArrMethod();
		//담을 변수를 하나 선언함
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		//힙에 공간을 만들어서 넣어여됨
		
		//배열에 직접넣을땐 새롭게 new를 써줘야됨
		int rs = arrs.sum(new int[] {1,2,3,4,5,6,7,8,9,10}); 
		System.out.println("1부터 10까지의 합은:" +rs);

		int rs2 = arrs.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1부터 10까지의 합은 :" + rs2);
	}

}
