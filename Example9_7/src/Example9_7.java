
public class Example9_7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		WindowActionEvent windowActionEvent = new WindowActionEvent();
		PoliceListen pllice = new PoliceListen();		//����������
		windowActionEvent.setMyCommandListener(pllice);//������ϼ�����
		windowActionEvent.setBounds(100,100,460,360);
		windowActionEvent.setTitle("���� ActionEvent �¼�");
	}

}
