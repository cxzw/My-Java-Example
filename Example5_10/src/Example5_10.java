
//�������ת�Ͷ���

class ����Գ{
	void crySpeak(String s) {
		System.out.println(s);
	}
}
class People extends ����Գ{
	void computer(int a,int b) {
		int c = a*b;
		System.out.println(c);
	}
	void crySpeak(String s) {
		System.out.println("***"+s+"***");
	}
}

public class Example5_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		����Գ monkey;
		People geng = new People();
		monkey = geng;		//monkey��Peoplede����geng����ת�Ͷ���
		monkey.crySpeak("I love this game");
		People people = (People) monkey;		//����ת�Ͷ���ǿ��ת��Ϊ����Ķ���
		people.computer(10, 10);
	}

}
