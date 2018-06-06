abstract class MotoVehicles{
	abstract void brake();
}		//抽象类机动车

interface MoneyFare{
	void charge();
}		//收费接口

interface ControlTemperature{
	void controlAirTemperature();
}		//空调方法

class Bus extends MotoVehicles implements MoneyFare{
	void brake() {
		System.out.println("公共汽车使用毂式刹车技术");
	}
	public void charge() {
		System.out.println("公共汽车：一元/张，不计公里数");
	}
}		//公共汽车类

class Taxi extends MotoVehicles implements MoneyFare,ControlTemperature{
	void brake() {
		System.out.println("出租车使用盘式刹车技术");
	}
	public void charge() {
		System.out.println("出租车：两元/公里，起价3公里");
	}
	public void controlAirTemperature() {
		System.out.println("出租车安装了海尔空调");
	}
}		//出租车类

class Cinema implements MoneyFare,ControlTemperature{
	public  void charge() {
		System.out.println("电影院门票：十元/场");
	}
	public void controlAirTemperature() {
		System.out.println("电影院安装了中央空调");
	}
}		//电影院类

public class Example6_3 {

	public static void main(String[] args) {
		Bus bus101 = new Bus();
		Taxi blueTaxi = new Taxi();
		Cinema wandaCinema = new Cinema();
		
		MoneyFare fare;
		//ControlTemperature temperature;
		
		fare = bus101;
		bus101.brake();
		bus101.charge();
		
		fare = blueTaxi;
		blueTaxi.brake();
		blueTaxi.charge();
		blueTaxi.controlAirTemperature();
		
		fare = wandaCinema;
		wandaCinema.charge();
		wandaCinema.controlAirTemperature();
		//temperature.controlAirTemperature();
	}

}
