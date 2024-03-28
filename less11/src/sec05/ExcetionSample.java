package sec05;

public class ExcetionSample {
	
	public static void main(String[] args) {
    try {
    	Class.forName("java.lang.String2");

    }catch(ClassNotFoundException e) {
    	e.printStackTrace();
    }
    
	}
}
