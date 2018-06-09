import java.io.*;

public class Read implements Runnable{
	DataInputStream in;
	public void setDataInputStream(DataInputStream in) {
		this.in = in;
	}
	public void run() {
		double result = 0;
		while (true) {
			try {
				result = in.readDouble();		//读取服务器发送来的消息
				System.out.println("圆的面积:"+result);
				System.out.println("输入圆的半径(放弃输入请按N):");
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				System.out.println("与服务器的链接已断开"+e);
				break;
			}
		}
	}
}
