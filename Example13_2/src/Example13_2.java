import java.net.*;

public class Example13_2 {
	public static void main(String[] args) {
		try {
			InetAddress address_1 = InetAddress.getByName("www.4399.com");
			System.out.println(address_1.toString());
			InetAddress address_2 = InetAddress.getByName("101.69.146.229");
			System.out.println(address_2.toString());
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
}
