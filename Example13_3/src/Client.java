//�ͻ���
import java.io.*;
import java.net.*;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		Socket mySocket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		Thread readData;
		Read read = null;
		try {
			mySocket = new Socket();
			read = new Read();
			readData = new Thread(read);		//�����ȡ��Ϣ���߳�
			System.out.println("�����������IP:");
			String IP = scanner.nextLine();
			System.out.println("����˿ں�:");
			int port = scanner.nextInt();
			if(mySocket.isConnected()) {}
			else {
				InetAddress address = InetAddress.getByName(IP);
				InetSocketAddress socketAddress = new InetSocketAddress(address, port);
				mySocket.connect(socketAddress);
				in = new DataInputStream(mySocket.getInputStream());
				out = new DataOutputStream(mySocket.getOutputStream());
				read.setDataInputStream(in);
				readData.start();		//���������ȡ��Ϣ���߳�  		
			}
		} catch (UnknownHostException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			System.out.println("��������������ѶϿ�"+e);
		}
		System.out.println("����Բ�İ뾶(���������밴N)");
		while (scanner.hasNext()) {
			double radius = 0;
			try {
				radius = scanner.nextDouble();
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				System.exit(0);
			}
			try {
				out.writeDouble(radius);
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	
}
	
