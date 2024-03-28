package sec09;

public class Student extends Person{
	//필드
	public int studentNo;
	
	//생성자 선언
	public Student(String name, int studentNo) {
		super(name); //슈퍼를 부모생성자 초기화 
		this.studentNo = studentNo;
	}
	//메소드 선언
	public void study() {
		System.out.println("자식 공부를 합니다.");
	}
}
