import java.net.*;
import java.io.*;

public class Look implements Runnable{
	URL url;
	public void setURL(URL url) {
		this.url = url;
	}
	public void run() {
		// TODO 自动生成的方法存根
		try {
			InputStream in = url.openStream();
			byte [] b = new byte[1024];
			int n = -1;
			while ((n = in.read(b)) != -1) {
				String str = new String(b, 0, n);
				System.out.print(str);
			}
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
