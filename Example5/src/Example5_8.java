
//使用super调用父类的构造方法

class Student{
	int number;
	String name;
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	Student(int number,String name){
		this.number = number;
		this.name = name;
		System.out.println("我的名字是:"+name+"   学号是:"+number);
	}
}
class UniverStudent extends Student{
	boolean 婚否;
	public UniverStudent(int number,String name,boolean b) {
		// TODO 自动生成的构造函数存根
		super(number,name);
		婚否 = b;
		System.out.println("婚否 = "+婚否);
	}
	
}
public class Example5_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		UniverStudent zhang = new UniverStudent(111435, "席子文", false);
	}

}
