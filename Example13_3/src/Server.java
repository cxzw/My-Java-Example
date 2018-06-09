//��������
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ServerSocket server = null;
		ServerThread thread;
		Socket you = null;
		while (true) {
			try {
				server = new ServerSocket(2010);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("���ڼ���");	//ServerSocket�������ظ�����
			}
			try {
				System.out.println("�ȴ��ͻ�����");
				you = server.accept();
				System.out.println("�ͻ��ĵ�ַ:"+you.getInetAddress());
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("���ڵȴ��ͻ�");
			}
			if(you != null) {
				new ServerThread(you).start();		//Ϊÿ���ͻ�ר������һ���߳�
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
		// TODO �Զ����ɵĹ��캯�����
		socket = t;
		try {
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	public void run() {
		while (true) {
			try {
				double r = in.readDouble();		//����״̬,���Ƕ�ȡ����Ϣ
				double area = Math.PI*r*r;
				out.writeDouble(area);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("�ͻ��뿪");
				return;
			}
		}
	}
}