package sec02;

public class ExceptionHandilingExam3 {

	public static void main(String[] args) {
		
         String[] array = {"123","loo"};
         
         for(int i = 0; i <= array.length; i++) {
        	 
        	 try {
        		 int value = Integer.parseInt(array[i]);
        		 System.out.println("array[" + i + "] : " + value);
        	 }catch(ArrayIndexOutOfBoundsException e) {
        		 System.out.println("배열 인덱스 초과됨 : " + e.getMessage());
        	 }catch(NumberFormatException e) {
        		 System.out.println("숫자로 변환 불가능 : " + e.getMessage());
        	 }
         }
    }
}
