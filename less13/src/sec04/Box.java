package sec04;

public class Box<T> {
    //필드
	private T t;
	
	//메소드 Getter
	public T get() {
		return t;
	}
	
	//메소드 Setter
	public void set(T t) {
		this.t = t;
	}
}
