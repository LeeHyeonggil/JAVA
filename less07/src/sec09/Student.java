package sec09;

public class Student extends Person{
	//�ʵ�
	public int studentNo;
	
	//������ ����
	public Student(String name, int studentNo) {
		super(name); //���۸� �θ������ �ʱ�ȭ 
		this.studentNo = studentNo;
	}
	//�޼ҵ� ����
	public void study() {
		System.out.println("�ڽ� ���θ� �մϴ�.");
	}
}
