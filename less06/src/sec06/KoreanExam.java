package sec06;

public class KoreanExam {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("��ö��",65,"581224-1235464");
		Korean k2 = new Korean("�̿���",40,"850807-2134564");
		
		System.out.println("����:" +k1.nation);
		System.out.println(k1.name+","+k1.age+"��,"+k1.ssn);
		System.out.println("����:" +k2.nation);
		System.out.println(k2.name+","+k2.age+"��,"+k2.ssn);
	}

}
