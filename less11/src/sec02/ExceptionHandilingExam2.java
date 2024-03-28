package sec02;

public class ExceptionHandilingExam2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("java.long.String");
			System.out.println("java.long.String 클래스가 존재합니다.");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			System.out.println("종료합니다");

	
	    try {
		    Class.forName("java.long.String2");
		    System.out.println("java.long.String2 클래스가 존재합니다.");
		
	    }catch(ClassNotFoundException e) {
		    e.printStackTrace();
	    }
	        System.out.println("종료합니다");

    }
}
