package ex07;

public class Child extends Parent {
	//�ʵ�
	public String name;
	//������
	 public Child() {
	 this("ȫ�浿");
	 System.out.println("Child() call");
	 }
	 //�޼ҵ�
	 public Child(String name) {
	 this.name = name;
	 System.out.println("Child(String name) call");
	 }
}
