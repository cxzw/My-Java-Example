import java.net.*;
import java.io.*;
import java.util.*;

public class Example13_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner;
		URL url;
		Thread readURL;
		Look look = new Look();
		System.out.println("����URL��Դ:");
		scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		try {
			url = new URL(source);
			look.setURL(url);
			readURL = new Thread(look);
			readURL.start();
		} catch (MalformedURLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
