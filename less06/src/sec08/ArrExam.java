package sec08;

public class ArrExam {

	public static void main(String[] args) {
		
		ArrMethod arrs = new ArrMethod();
		//���� ������ �ϳ� ������
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		//���� ������ ���� �־��
		
		//�迭�� ���������� ���Ӱ� new�� ����ߵ�
		int rs = arrs.sum(new int[] {1,2,3,4,5,6,7,8,9,10}); 
		System.out.println("1���� 10������ ����:" +rs);

		int rs2 = arrs.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("1���� 10������ ���� :" + rs2);
	}

}
