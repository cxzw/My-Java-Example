
public class Example7_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
			System.out.println("无法再装载重量是"+m+"吨的集装箱");
		}
		finally {
			System.out.println("货船将正点起航");
		}
	}

}
