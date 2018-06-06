interface SayHello{
	void sayHello();
}

class Chinese implements SayHello{
	public void sayHello() {
		System.out.println("中国人习惯问候语：早，吃了么您？");
	}
}

class English implements SayHello{
	public void sayHello() {
		System.out.println("英国人习惯问候语：Yo man,what's up?");
	}
}

class KindHello{
	public void lookHello(SayHello hello) {		//接口类参数
		hello.sayHello();						//接口回调95*
	}
}

public class Example6_5 {

	public static void main(String[] args) {
		KindHello kindHello = new KindHello();
		kindHello.lookHello(new Chinese());
		kindHello.lookHello(new English());
	}
}