package sec05;

public class Student {
	//�ʵ� - ��ü�� �����Ͱ� ����Ǵ� ��
	int age;
	String name;
	int grade;
	
	//������ Student(){} -   ��ü ���� �� �ʱ�ȭ ��Ȱ ���
	Student(int age, String name, int grade){
		this.age = age;     //�ʵ尪 �ʱ�ȭ / �Ű�������
		this.name = name;
		this.grade = grade;
	}
	//�޼ҵ� - ��ü�� �������� ȣ��� ����Ǵ� ��
	public void study() {
		System.out.println("�����ð����� ���θ� ������ �մϴ�.");
	}
	public void home() {
		System.out.println("������ ������ ���� ���ϴ�.");
	}
}
// �̰��� �� ���赵 ���̺귯�� Ŭ��