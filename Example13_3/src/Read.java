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
				result = in.readDouble();		//��ȡ����������������Ϣ
				System.out.println("Բ�����:"+result);
				System.out.println("����Բ�İ뾶(���������밴N):");
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("��������������ѶϿ�"+e);
				break;
			}
		}
	}
}
