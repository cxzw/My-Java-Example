
public class Example12_9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ThreadJoin a= new ThreadJoin();
		Thread customer = new Thread(a);
		Thread cakeMaker = new Thread(a);
		customer.setName("�˿�");
		cakeMaker.setName("����");
		a.setjoinThread(cakeMaker);
		customer.start();
	}

}
