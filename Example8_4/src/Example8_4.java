//�����ɸ���֮�ͣ����ɸ����Ӽ������롣�����쳣����
public class Example8_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double sum = 0,item = 0;
		boolean computable = true;
		for(String s:args) {
			try {
				item = Double.parseDouble(s);
				sum += item;
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("�������˷Ƿ��ַ�:"+e);
				computable = false;
			}
		}
		if (computable) {
			System.out.println("sum="+sum);
		}
	}

}
