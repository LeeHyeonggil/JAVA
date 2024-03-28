package sec10;

public class AnimalExam {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breathe(); //animal 메소드
		cat.sound();
		
		dog.breathe();
		dog.sound();
		
		//매개변수 다형성을 이용
		animalSound(new Dog());
		animalSound(new Cat());
		
	}		
		
	//다형성을 이용해 출력
		public static void animalSound(Animal animal) {
			animal.sound();
		}
	
}
