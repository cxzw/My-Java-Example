interface SayHello{
	void sayHello();
}

class Chinese implements SayHello{
	public void sayHello() {
		System.out.println("�й���ϰ���ʺ���磬����ô����");
	}
}

class English implements SayHello{
	public void sayHello() {
		System.out.println("Ӣ����ϰ���ʺ��Yo man,what's up?");
	}
}

class KindHello{
	public void lookHello(SayHello hello) {		//�ӿ������
		hello.sayHello();						//�ӿڻص�95*
	}
}

public class Example6_5 {

	public static void main(String[] args) {
		KindHello kindHello = new KindHello();
		kindHello.lookHello(new Chinese());
		kindHello.lookHello(new English());
	}
}