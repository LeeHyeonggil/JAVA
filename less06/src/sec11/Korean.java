package sec11;

public class Korean {
	//인스턴스 final 필드
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	//생성자 선언
	public Korean(String ssn) {
		this.ssn = ssn;

	}
	//메소드 초기화
	void koreanInit(String getName) {

		this.name = getName;
		System.out.println(this.ssn+"-"+this.name);
	}
}
