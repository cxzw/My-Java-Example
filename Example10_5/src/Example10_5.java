import java.io.*;

public class Example10_5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte [] a = "新年快乐".getBytes();
		byte [] b = "Happy new year".getBytes();
		File file = new File("a.txt");
		try {
			OutputStream outputStream = new FileOutputStream(file);
			System.out.println(file.getName()+"的大小:"+file.length()+"字节");
			outputStream .write(a);
			outputStream.close();
			outputStream = new FileOutputStream(file,true);
			System.out.println(file.getName()+"的大小:"+file.length()+"字节");
			outputStream.write(b, 0, b.length);
			System.out.println(file.getName()+"的大小"+file.length()+"字节");
			outputStream.close();
		}
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error "+e);
		}
	}
}
