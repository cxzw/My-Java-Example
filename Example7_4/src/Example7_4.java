
public class Example7_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n = 0,m = 0,t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89"); 		//�����쳣��ת��catch 
			t = 77;			//δ����ֵ
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("�����쳣��"+e.getMessage());
		}
		System.out.println("n="+n+",m="+m+",t="+t);
		try {
			System.out.println("�����׳�I/O�쳣��");
			throw new java.io.IOException("���ǹ����");		//�����׳��쳣
		} catch (java.io.IOException e) {
			// TODO: handle exception
			System.out.println("�����쳣:"+e.getMessage());
		}
	}

}
