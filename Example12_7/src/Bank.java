

public class Bank implements Runnable{
	int money = 200;
	public void setMoney(int n) {
		money = n;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		if (Thread.currentThread().getName().equals("���")) {
			saveOrTake(300);
		} else if (Thread.currentThread().getName().equals("����")) {
			saveOrTake(150);
		}
	}
	public synchronized void saveOrTake(int amount) {
		if (Thread.currentThread().getName().equals("���")) {
			for (int i = 1; i <=3; i++) {
				money +=amount/3;
				System.out.println(Thread.currentThread().getName()+"����"+amount/3+"��,������"+money+"��,��Ϣ���ٴ�.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		} else if (Thread.currentThread().getName().equals("����")) {
			for(int i=1;i<=3;i++) {
				money = money-amount/3;
				System.out.println(Thread.currentThread().getName()+"ȡ��"+amount/3+"��,������"+money+"��,��Ϣһ����ȡ.");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
