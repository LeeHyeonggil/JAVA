package ex07;

public class Child extends Parent {
	//필드
	public String name;
	//생성자
	 public Child() {
	 this("홍길동");
	 System.out.println("Child() call");
	 }
	 //메소드
	 public Child(String name) {
	 this.name = name;
	 System.out.println("Child(String name) call");
	 }
}
