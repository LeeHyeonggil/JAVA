package ex07;

public class Parent {
	//필드
	public String nation;
	 //생성자
	 public Parent() {
	  this("대한민국");
	  System.out.println("Parent() call");
	 }
	 //메소드
	 public Parent(String nation) {
	  this.nation = nation;
	  System.out.println("Parent(String nation) call");
	 }
}
