package sec10;

public class Television {
//라이브러리 클라스
	
	//정적 멤버안에서 인스턴스 멤버는 사용할 수 없다.
	
	//인스턴스 멤버
	int pay = 20000000;
	String color;
	
	//정적 멤버
	static String company = "LG";  //정적필드는 일반적으로 바로 초기화를 한다.
	static String model = "OLED";
	static String info; //필드
	//정적필드블록을 이용함
	static {
		info = company + "-" + model; //정적블록을 선언하는 방법
	}
	
	
	void method1(int getPay) {           //인스턴스메소드
 		this.pay = getPay;
		this.color = "빨강";
				System.out.println(this.pay + "," + this.color + info);  //직접 정적메소드를 쓰는것이 가능하다
	}
	
	static void method2() {    //정적 메소드
		System.out.println(info);  
	}
	
	
	
}
