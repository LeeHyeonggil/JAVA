package ex07;

public class ChildExample {

	public static void main(String[] args) {
		 Child child = new Child();

		 /*this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
		1. main�� Child child = new Child() ���� public Child()�� �̵�
		2. this("ȫ�浿") ���� ���� �ڵ����� �����Ǵ� �⺻ �θ� ������ ȣ�� -> super()
		3. public Parent()�� �̵��Ͽ� this("���ѹα�")���� public Parent(String nation)���� �̵�
		4. ��Parent(String nation) call ���
		5. �ٽ� public Parent()�� ���ƿ� �� ��Parent() call ���
		6. �ٽ� public Child()�� ���ƿ� �� this("ȫ�浿")�� ���� public Child(String name)���� �̵�
		7. ��Child(String name) call ���
		8. �ٽ� public Child()�� ���ƿ� �� ��Child() call ���*/
	}

}
