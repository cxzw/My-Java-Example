interface ShowMessage{
	void 显示商标 (String s);
}
class TV implements ShowMessage{
	public void 显示商标 (String s) {
		System.out.println(s);
	}
}
class PC implements ShowMessage{
	public  void 显示商标(String s) {
		System.out.println(s);
	}
}

public class Example6_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ShowMessage sm;
		sm = new TV();
		sm.显示商标("长城牌电视机");
		sm = new PC();
		sm.显示商标("联想本月牌电视机");
	}

}
