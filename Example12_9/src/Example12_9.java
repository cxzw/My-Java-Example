
public class Example12_9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ThreadJoin a= new ThreadJoin();
		Thread customer = new Thread(a);
		Thread cakeMaker = new Thread(a);
		customer.setName("顾客");
		cakeMaker.setName("蛋糕");
		a.setjoinThread(cakeMaker);
		customer.start();
	}

}
