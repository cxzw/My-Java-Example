import java.io.*;

public class Example10_5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		byte [] a = "�������".getBytes();
		byte [] b = "Happy new year".getBytes();
		File file = new File("a.txt");
		try {
			OutputStream outputStream = new FileOutputStream(file);
			System.out.println(file.getName()+"�Ĵ�С:"+file.length()+"�ֽ�");
			outputStream .write(a);
			outputStream.close();
			outputStream = new FileOutputStream(file,true);
			System.out.println(file.getName()+"�Ĵ�С:"+file.length()+"�ֽ�");
			outputStream.write(b, 0, b.length);
			System.out.println(file.getName()+"�Ĵ�С"+file.length()+"�ֽ�");
			outputStream.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}
}
