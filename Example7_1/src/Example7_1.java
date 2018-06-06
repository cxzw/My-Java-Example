
//内部类

class RedCowForm{
	static String formName;
	RedCow cow;
	public RedCowForm() {
		// TODO 自动生成的构造函数存根
	}
	RedCowForm(String s) {
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess() {
		cow.speak();
	}
	class RedCow{	//内部类的声明
		String cowName = "红牛";
		int height,weight,price;
		public RedCow(int h,int w,int p) {
			// TODO 自动生成的构造函数存根
			height = h;
			weight = w;
			price = p;
		}	
		void speak() {
			System.out.println("我是"+cowName+"身高"+height+"cm 体重"+weight+"kg,生活在"+formName);
		}
	}		//内部类结束
}			//外嵌类结束

public class Example7_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RedCowForm form = new RedCowForm("红牛农场");
		form.showCowMess();
		form.cow.speak();
	}

}
