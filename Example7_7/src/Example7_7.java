
public class Example7_7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		CargoBoat ship = new CargoBoat();
		ship.setMaxContent(1000);
		int m = 600;
		try {
			ship.loading(m);
			m = 400;
			ship.loading(m);
			m = 367;
			ship.loading(m);
			m = 555;
			ship.loading(m);
		}
		catch (DangerException e) {
			// TODO: handle exception
			System.out.println(e.warnmess());
			System.out.println("�޷���װ��������"+m+"�ֵļ�װ��");
		}
		finally {
			System.out.println("������������");
		}
	}

}
