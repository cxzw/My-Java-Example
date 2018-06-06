
public class Example7_4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 0,m = 0,t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab89"); 		//发生异常，转向catch 
			t = 77;			//未被赋值
		}
		catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("发生异常："+e.getMessage());
		}
		System.out.println("n="+n+",m="+m+",t="+t);
		try {
			System.out.println("故意抛出I/O异常！");
			throw new java.io.IOException("我是故意的");		//故意抛出异常
		} catch (java.io.IOException e) {
			// TODO: handle exception
			System.out.println("发生异常:"+e.getMessage());
		}
	}

}
