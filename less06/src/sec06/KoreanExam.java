package sec06;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("안철수",65,"581224-1235464");
		Korean k2 = new Korean("이영자",40,"850807-2134564");
		
		System.out.println("국적:" +k1.nation);
		System.out.println(k1.name+","+k1.age+"세,"+k1.ssn);
		System.out.println("국적:" +k2.nation);
		System.out.println(k2.name+","+k2.age+"세,"+k2.ssn);
	}

}
