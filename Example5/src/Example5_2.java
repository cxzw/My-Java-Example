/*  git config --global user.email "ziwen.xi@outlook.com"
  git config --global user.name "cxzw"*/
//�̳�

class People{
	private int averHeight = 166;
	public int getAverHeight() {
		return averHeight;
	}
}

class ChinesePeople extends People{
	int height;
	public void setHeght(int h) {
		height = h;
	}
	public int getHeight() {
		return height;
	}
}

public class Example5_2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ChinesePeople zhangsan = new ChinesePeople();
		System.out.println("�������δ�̳е�averheight��ֵ��:"+zhangsan.getAverHeight());
		zhangsan.setHeght(178);
		System.out.println("��������ʵ������height��ֵ��:"+zhangsan.getHeight());
	}

}
