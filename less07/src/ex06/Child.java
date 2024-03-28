package ex06;

public class Child extends Parent{
	public int studentNo;
	 
	 public Child(String name, int studentNo) {
	  //this.name = name; 모든 객체는 생성자를 호출해야만 생성된다.
	  super(name);
	  this.studentNo = studentNo;
	 }
}
