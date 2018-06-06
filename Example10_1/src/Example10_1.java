import java.io.*;

public class Example10_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f = new File("G:\\Java工程\\Example10_1\\src", "Example10_1.java");
		System.out.println(f.getName()+"是可读的吗:"+f.canRead());
		System.out.println(f.getName()+"的长度是:"+f.length());
		System.out.println(f.getName()+"的绝对路径:"+f.getAbsolutePath());
		File file = new File("new.txt");
		System.out.println("在当前目录下创建新文件"+file.getName());
		System.out.println(file.getName()+"是可读的吗:"+file.canRead());
		System.out.println(file.getName()+"的长度是:"+file.length());
		System.out.println(file.getName()+"的绝对路径:"+file.getAbsolutePath());
		System.out.println(file.getName()+"的父目录:"+file.getParent());
		if(file.exists()) {
			System.out.println("文件已存在！");
		}
		else {
			try {
				file.createNewFile();
				System.out.println("创建成功！");
			}
			catch (IOException exp) {
				// TODO: handle exception
			}
		}
	}

}
