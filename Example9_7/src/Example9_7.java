
public class Example9_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		WindowActionEvent windowActionEvent = new WindowActionEvent();
		PoliceListen pllice = new PoliceListen();		//创建监视器
		windowActionEvent.setMyCommandListener(pllice);//窗口组合监视器
		windowActionEvent.setBounds(100,100,460,360);
		windowActionEvent.setTitle("处理 ActionEvent 事件");
	}

}
