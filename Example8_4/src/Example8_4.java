//求若干个数之和，若干个数从键盘输入。包含异常处理
public class Example8_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double sum = 0,item = 0;
		boolean computable = true;
		for(String s:args) {
			try {
				item = Double.parseDouble(s);
				sum += item;
			}
			catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("您输入了非法字符:"+e);
				computable = false;
			}
		}
		if (computable) {
			System.out.println("sum="+sum);
		}
	}

}
