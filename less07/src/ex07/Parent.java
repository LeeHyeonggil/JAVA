package ex07;

public class Parent {
	//�ʵ�
	public String nation;
	 //������
	 public Parent() {
	  this("���ѹα�");
	  System.out.println("Parent() call");
	 }
	 //�޼ҵ�
	 public Parent(String nation) {
	  this.nation = nation;
	  System.out.println("Parent(String nation) call");
	 }
}
