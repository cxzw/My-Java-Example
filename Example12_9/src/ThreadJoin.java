

public class ThreadJoin implements Runnable{
	Cake cake;
	Thread joinThread;
	public void setjoinThread(Thread t) {
		joinThread = t;
	}
	public void run() {
		if (Thread.currentThread().getName().equals("顾客")) {
			System.out.println(Thread.currentThread().getName()+"等待"+joinThread.getName()+"制作生日蛋糕");
			try {
				joinThread.start();
				joinThread.join();
			} catch (InterruptedException e) {}
				System.out.println(Thread.currentThread().getName()+"买了"+cake.name+" 价钱:"+cake.price);
		}
			else if (Thread.currentThread() == joinThread) {
				System.out.println(joinThread.getName()+"开始制作生日蛋糕,请稍等...");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
				cake = new Cake("生日蛋糕", 158);
				System.out.println(joinThread.getName()+"");
			}
		}
	
	class Cake{
		int price;
		String name;
		Cake(String name,int price){
			this.name = name;
			this.price = price;
		}
	}
}
