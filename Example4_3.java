package sy;

class XiyoujiRenwu{
	float height,weight;
	String head,ear;
	void speak(String s) {
		head = "����ͷ";
		System.out.println(s);
	}
}

public class Example4_3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		XiyoujiRenwu zhubajie,sunwukong;
		zhubajie = new XiyoujiRenwu();
		sunwukong = new XiyoujiRenwu();
		zhubajie.height = 1.80f;
		zhubajie.head = "��ͷ";
		zhubajie.ear = "һ˫�����";
		sunwukong.height = 1.62f;
		sunwukong.weight = 1000f;
		sunwukong.head = "�㷢ƮƮ";
		System.out.println("zhubajie�����:"+zhubajie.height);
		System.out.println("zhubajie��ͷ:"+zhubajie.head);
		System.out.println("sunwukong������"+sunwukong.weight);
		System.out.println("sunwukong��ͷ"+sunwukong.head);
		zhubajie.speak("����������Ȣϱ��");
		System.out.println("zhubajie���ڵ�ͷ"+zhubajie.head);
		sunwukong.speak("��������1000�����ƭ�˽䱳��");
		System.out.println("sunwukong���ڵ�ͷ��"+sunwukong.head);
	}
 
}
