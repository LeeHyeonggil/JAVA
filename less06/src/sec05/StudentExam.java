package sec05;

public class StudentExam {

	public static void main(String[] args) {

		Student s1 = new Student (18, "홍길동", 2);
		Student s2 = new Student (19, "이영자", 3);
		System.out.println("s1 변수가 student 객체를 참조한다.");
		
		System.out.println(s1.age);
		System.out.println(s1.grade);
		System.out.println(s1.name);
		
		System.out.println(s2.age);
		System.out.println(s2.grade);
		System.out.println(s2.name);
		
		
		s1.study();
		s1.home();
	}

}
