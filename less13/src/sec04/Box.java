package sec04;

public class Box<T> {
    //�ʵ�
	private T t;
	
	//�޼ҵ� Getter
	public T get() {
		return t;
	}
	
	//�޼ҵ� Setter
	public void set(T t) {
		this.t = t;
	}
}
