import java.util.*;
import java.text.SimpleDateFormat;

public class Home implements Runnable{
	int time = 0;
	SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
	Date date;
	public void run() {
		while (true) {
			date = new Date()	;
			System.out.println(m.format(date));
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			if (time == 3) {
				Thread thread = Thread.currentThread();
				thread = new Thread(this);
				thread.start();
			}
		}
	}
}
