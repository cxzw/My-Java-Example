package Example4_10;

//ʵ�������������

public class Exampl4_10 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Lader.bottom = 100;
		Lader laderone = new Lader();
		Lader ladertwo = new Lader();
		laderone.getAbove(28);
		ladertwo.getAbove(66);
		System.out.println("laderone��above:"+laderone.getAbove());
		System.out.println("laderone��bottom:"+laderone.getBottom());
		System.out.println("ladertwo��above:"+ladertwo.getAbove());
		System.out.println("ladertwo��bottom:"+ladertwo.getBottom());
	}

}
