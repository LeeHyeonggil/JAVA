package sec0703;

public class ChildExam {

	public static void main(String[] args) {
		
		//�ڽ�Ŭ���� ��ü�� �����ϸ鼭 �θ�Ÿ������ �ڵ�Ÿ�Ժ�ȯ
		Parent parent = new Child();
		//Ÿ��  ����
		//Parent Ÿ������ ���
		parent.field = "������";
		parent.method1();
		parent.method2();
		
//		parent.field2;
//		parent.method3();
		//�ڽ�Ŭ���� Ÿ������ ���� Ÿ�Ժ�ȯ
		Child child = (Child)parent;
		child.field = "������";
		child.method1();
		child.method2();
		
		child.field2 = "������2";
		child.method3();

	}

}
