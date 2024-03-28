package sec02;

public class ErrExam {

	public static void main(String[] args) {
		try {
		int value = Integer.parseInt("loo");
		}catch(NumberFormatException e) {
			System.err.println("에러발생");
			System.err.println(e.getMessage());
		}
	}

}
