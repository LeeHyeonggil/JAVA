package sec04;

public class GenExam3 {

	//제네릭 메소드
		public static<T> Box<T> boxing(T t){
			Box<T> box = new Box<T>();
			box.set(t);
			return box;
		}
	
	
	//실행 메소드
	public static void main(String[] args) {
		//제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
