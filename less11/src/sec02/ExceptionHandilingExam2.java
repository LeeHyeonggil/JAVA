package sec02;

public class ExceptionHandilingExam2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.long.String");
			System.out.println("java.long.String Ŭ������ �����մϴ�.");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			System.out.println("�����մϴ�");

	
	    try {
		    Class.forName("java.long.String2");
		    System.out.println("java.long.String2 Ŭ������ �����մϴ�.");
		
	    }catch(ClassNotFoundException e) {
		    e.printStackTrace();
	    }
	        System.out.println("�����մϴ�");

    }
}
