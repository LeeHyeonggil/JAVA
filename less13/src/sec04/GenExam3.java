package sec04;

public class GenExam3 {

	//���׸� �޼ҵ�
		public static<T> Box<T> boxing(T t){
			Box<T> box = new Box<T>();
			box.set(t);
			return box;
		}
	
	
	//���� �޼ҵ�
	public static void main(String[] args) {
		//���׸� �޼ҵ� ȣ��
		Box<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("ȫ�浿");
		String strValue = box2.get();
		System.out.println(strValue);

	}

}
