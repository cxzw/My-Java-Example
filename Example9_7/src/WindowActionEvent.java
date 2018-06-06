import java.awt.*;

import javax.naming.InitialContext;
import javax.swing.*;

public class WindowActionEvent extends JFrame{
	JTextField inputText;
	JTextArea textshow;
	JButton button;
	MyCommandListener listener;
	public WindowActionEvent() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		inputText = new JTextField(10);
		button = new JButton("确定");
		textshow = new JTextArea(9,30);
		add(inputText);
		add(button);
		add(new JScrollPane(textshow));
	}
	void setMyCommandListener(MyCommandListener listener) {
		this.listener = listener;
		listener.setJTextField(inputText);
		listener.setJTextArea(textshow);
		inputText.addActionListener(listener);
		inputText.addActionListener(listener);
		//inputText是事件源，listener是监视器
		button.addActionListener(listener);
		//button是事件源，listener是监视器
	}
}
