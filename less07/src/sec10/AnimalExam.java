package sec10;

public class AnimalExam {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		cat.breathe(); //animal �޼ҵ�
		cat.sound();
		
		dog.breathe();
		dog.sound();
		
		//�Ű����� �������� �̿�
		animalSound(new Dog());
		animalSound(new Cat());
		
	}		
		
	//�������� �̿��� ���
		public static void animalSound(Animal animal) {
			animal.sound();
		}
	
}
