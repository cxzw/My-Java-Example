import java.io.*;

public class Example10_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f = new File("G:\\Java����\\Example10_1\\src", "Example10_1.java");
		System.out.println(f.getName()+"�ǿɶ�����:"+f.canRead());
		System.out.println(f.getName()+"�ĳ�����:"+f.length());
		System.out.println(f.getName()+"�ľ���·��:"+f.getAbsolutePath());
		File file = new File("new.txt");
		System.out.println("�ڵ�ǰĿ¼�´������ļ�"+file.getName());
		System.out.println(file.getName()+"�ǿɶ�����:"+file.canRead());
		System.out.println(file.getName()+"�ĳ�����:"+file.length());
		System.out.println(file.getName()+"�ľ���·��:"+file.getAbsolutePath());
		System.out.println(file.getName()+"�ĸ�Ŀ¼:"+file.getParent());
		if(file.exists()) {
			System.out.println("�ļ��Ѵ��ڣ�");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("�����ɹ���");
			}
			catch (IOException exp) {
				// TODO: handle exception
			}
		}
	}

}
