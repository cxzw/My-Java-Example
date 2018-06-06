/*  git config --global user.email "ziwen.xi@outlook.com"
  git config --global user.name "cxzw"*/
//继承

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
		// TODO 自动生成的方法存根
		ChinesePeople zhangsan = new ChinesePeople();
		System.out.println("子类对象未继承的averheight的值是:"+zhangsan.getAverHeight());
		zhangsan.setHeght(178);
		System.out.println("子类对象的实例变量height的值是:"+zhangsan.getHeight());
	}

}
