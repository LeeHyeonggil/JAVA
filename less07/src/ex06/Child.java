package ex06;

public class Child extends Parent{
	public int studentNo;
	 
	 public Child(String name, int studentNo) {
	  //this.name = name; ��� ��ü�� �����ڸ� ȣ���ؾ߸� �����ȴ�.
	  super(name);
	  this.studentNo = studentNo;
	 }
}
