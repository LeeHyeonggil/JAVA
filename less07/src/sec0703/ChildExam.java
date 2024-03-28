package sec0703;

public class ChildExam {

	public static void main(String[] args) {
		
		//자식클래스 객체를 생성하면서 부모타입으로 자동타입변환
		Parent parent = new Child();
		//타입  변수
		//Parent 타입으로 사용
		parent.field = "데이터";
		parent.method1();
		parent.method2();
		
//		parent.field2;
//		parent.method3();
		//자식클래스 타입으로 강제 타입변환
		Child child = (Child)parent;
		child.field = "데이터";
		child.method1();
		child.method2();
		
		child.field2 = "데이터2";
		child.method3();

	}

}
