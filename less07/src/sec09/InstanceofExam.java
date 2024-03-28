package sec09;

public class InstanceofExam {
	
		//�޼ҵ� - main()���� �ٷ� ȣ���ϱ� ���� �������� ����
		public static void personInfo(Person person) { //������
			System.out.println("name :" + person.name);
			person.walk();
		
		//person �� Student Ÿ������ Ȯ��
		if(person instanceof Student) {
			//Student ��ü�� ��� ���� Ÿ�� ��ȯ
			Student student = (Student) person;
			//Student ��ü�� ������ �ִ� �ʵ� �� �޼ҵ� ���
			System.out.println("studentNo :" + student.studentNo);
			student.study();
			}
		
		/* java 12�̻��� ��� person�� �����ϴ� ��ü�� Student Ÿ���� ��� �ٷ� student ����
		 * if(person instanceof student student){
		 * System.out.println("studentNo :" + student.studentNo);
			student.study();
		 * }
		 */
		
		}
		
	public static void main(String[] args) {
		//Person ��ü�� �Ű������� �����ϰ� �ٷ� persionInfo() �޼ҵ� ȣ��
		Person p1 = new Person("ȫ�浿");
		personInfo(p1);
		
		System.out.println();
		
		Person p2 = new Student("��ö��", 10);
		personInfo(p2);
	}

}
