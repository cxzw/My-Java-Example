interface ShowMessage{
	void ��ʾ�̱� (String s);
}
class TV implements ShowMessage{
	public void ��ʾ�̱� (String s) {
		System.out.println(s);
	}
}
class PC implements ShowMessage{
	public  void ��ʾ�̱�(String s) {
		System.out.println(s);
	}
}

public class Example6_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ShowMessage sm;
		sm = new TV();
		sm.��ʾ�̱�("�����Ƶ��ӻ�");
		sm = new PC();
		sm.��ʾ�̱�("���뱾���Ƶ��ӻ�");
	}

}
