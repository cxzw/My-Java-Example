import java.awt.event.*;
import javax.swing.*;

public class PoliceListen implements MyCommandListener{		//���𴴽�����������
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
		textshow.append(str+"�ĳ���"+str.length()+"\n");
	}
}
