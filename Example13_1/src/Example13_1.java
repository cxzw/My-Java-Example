import java.net.*;
import java.io.*;
import java.util.*;

public class Example13_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner;
		URL url;
		Thread readURL;
		Look look = new Look();
		System.out.println("输入URL资源:");
		scanner = new Scanner(System.in);
		String source = scanner.nextLine();
		try {
			url = new URL(source);
			look.setURL(url);
			readURL = new Thread(look);
			readURL.start();
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
