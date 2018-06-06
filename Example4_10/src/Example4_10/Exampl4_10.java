package Example4_10;

//实例变量和类变量

public class Exampl4_10 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Lader.bottom = 100;
		Lader laderone = new Lader();
		Lader ladertwo = new Lader();
		laderone.getAbove(28);
		ladertwo.getAbove(66);
		System.out.println("laderone的above:"+laderone.getAbove());
		System.out.println("laderone的bottom:"+laderone.getBottom());
		System.out.println("ladertwo的above:"+ladertwo.getAbove());
		System.out.println("ladertwo的bottom:"+ladertwo.getBottom());
	}

}
