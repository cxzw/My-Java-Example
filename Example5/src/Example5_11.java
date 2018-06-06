
//继承与多态

class Animals{
	void cry() {
		
	}
}
class Dog extends Animals{
	void cry() {
		System.out.println("汪汪......");
	}
}
class Cat extends Animals{
	void cry() {
		System.out.println("喵喵......");
	}
}
public class Example5_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Animals animals;
		animals = new Dog();
		animals.cry();
		animals = new Cat();
		animals.cry();
	}

}
