//客户端
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		Socket mySocket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Thread readData;
		Read read = null;
		try {
			mySocket = new Socket();
			read = new Read();
			readData = new Thread(read);		//负责读取信息的线程
			System.out.println("输入服务器的IP:");
			String IP = scanner.nextLine();
			System.out.println("输入端口号:");
			int port = scanner.nextInt();
			if(mySocket.isConnected()) {}
			else {
				InetAddress address = InetAddress.getByName(IP);
				InetSocketAddress socketAddress = new InetSocketAddress(address, port);
				mySocket.connect(socketAddress);
				in = new DataInputStream(mySocket.getInputStream());
				out = new DataOutputStream(mySocket.getOutputStream());
				read.setDataInputStream(in);
				readData.start();		//启动负责读取信息的线程  		
			}
		} catch (UnknownHostException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			System.out.println("与服务器的链接已断开"+e);
		}
		System.out.println("输入圆的半径(放弃输入请按N)");
		while (scanner.hasNext()) {
			double radius = 0;
			try {
				radius = scanner.nextDouble();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				System.exit(0);
			}
			try {
				out.writeDouble(radius);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
}
	
