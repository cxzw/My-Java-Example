
//������

abstract class GirlFriend{	//�����࣬��װ��������Ϊ��׼
	abstract void speak();
	abstract void cooking();
}
class ChainaGirlFriend extends GirlFriend{
	void speak() {
		System.out.println("��ã�");
	}
	void cooking() {
		System.out.println("ˮ����");
	}
}
class AmericanGirlFriend extends GirlFriend{
	void speak() {
		System.out.println("hello!");
	}
	void cooking() { 
		System.out.println("roast beef");
	}
}
class Boy{
	GirlFriend friend;
	void setGirlfriend(GirlFriend f) {
		friend = f;
	}
	void showGirlFriend() {
		friend.speak();
		friend.cooking();
	}
}

public class Example5_12 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GirlFriend girl = new ChainaGirlFriend();
		Boy boy = new Boy();
		boy.setGirlfriend(girl);
		boy.showGirlFriend();
		girl = new AmericanGirlFriend();
		boy.setGirlfriend(girl);
		boy.showGirlFriend();
	}

}
