import java.awt.event.*;
import javax.swing.*;

public interface MyCommandListener extends ActionListener{		//子接口多给出了两个方法
	public void setJTextField(JTextField text);
	public void setJTextArea(JTextArea area);
}
