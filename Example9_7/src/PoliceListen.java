import java.awt.event.*;
import javax.swing.*;

public class PoliceListen implements MyCommandListener{		//负责创建监视器的类
	JTextField textInput;
	JTextArea textshow;
	public void setJTextField(JTextField text) {
		textInput = text;
	}
	public void setJTextArea(JTextArea area) {
		textshow = area;
	}
	public void actionPerformed(ActionEvent e) {
		String str = textInput.getText();
		textshow.append(str+"的长度"+str.length()+"\n");
	}
}
