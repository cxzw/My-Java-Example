
//ʹ��super���ø���Ĺ��췽��

class Student{
	int number;
	String name;
	public Student() {
		// TODO �Զ����ɵĹ��캯�����
	}
	Student(int number,String name){
		this.number = number;
		this.name = name;
		System.out.println("�ҵ�������:"+name+"   ѧ����:"+number);
	}
}
class UniverStudent extends Student{
	boolean ���;
	public UniverStudent(int number,String name,boolean b) {
		// TODO �Զ����ɵĹ��캯�����
		super(number,name);
		��� = b;
		System.out.println("��� = "+���);
	}
	
}
public class Example5_8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		UniverStudent zhang = new UniverStudent(111435, "ϯ����", false);
	}

}
