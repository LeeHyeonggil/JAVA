package sec05;

public class Student {
	//필드 - 객체의 데이터가 저장되는 곳
	int age;
	String name;
	int grade;
	
	//생성자 Student(){} -   객체 생성 시 초기화 역활 담당
	Student(int age, String name, int grade){
		this.age = age;     //필드값 초기화 / 매개변수값
		this.name = name;
		this.grade = grade;
	}
	//메소드 - 객체의 동작으로 호출시 실행되는 곳
	public void study() {
		System.out.println("수업시간에는 공부를 열심히 합니다.");
	}
	public void home() {
		System.out.println("수업이 끝나면 집에 갑니다.");
	}
}
// 이곳은 빈 설계도 라이브러리 클라스