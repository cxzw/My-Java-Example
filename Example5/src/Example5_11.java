
//�̳����̬

class Animals{
	void cry() {
		
	}
}
class Dog extends Animals{
	void cry() {
		System.out.println("����......");
	}
}
class Cat extends Animals{
	void cry() {
		System.out.println("����......");
	}
}
public class Example5_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Animals animals;
		animals = new Dog();
		animals.cry();
		animals = new Cat();
		animals.cry();
	}

}
