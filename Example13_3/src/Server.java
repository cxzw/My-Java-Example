//服务器端
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ServerSocket server = null;
		ServerThread thread;
		Socket you = null;
		while (true) {
			try {
				server = new ServerSocket(2010);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				System.out.println("正在监听");	//ServerSocket对象不能重复创建
			}
			try {
				System.out.println("等待客户呼叫");
				you = server.accept();
				System.out.println("客户的地址:"+you.getInetAddress());
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				System.out.println("正在等待客户");
			}
			if(you != null) {
				new ServerThread(you).start();		//为每个客户专门启动一个线程
			}
		}
	}
}
class ServerThread extends Thread{
	Socket socket;
	DataInputStream in = null;
	DataOutputStream out = null;
	String s = null;
	public ServerThread(Socket t) {
		// TODO 自动生成的构造函数存根
		socket = t;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public void run() {
		while (true) {
			try {
				double r = in.readDouble();		//阻塞状态,除非读取到信息
				double area = Math.PI*r*r;
				out.writeDouble(area);
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				System.out.println("客户离开");
				return;
			}
		}
	}
}