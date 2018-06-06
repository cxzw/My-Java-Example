abstract class MotoVehicles{
	abstract void brake();
}		//�����������

interface MoneyFare{
	void charge();
}		//�շѽӿ�

interface ControlTemperature{
	void controlAirTemperature();
}		//�յ�����

class Bus extends MotoVehicles implements MoneyFare{
	void brake() {
		System.out.println("��������ʹ���ʽɲ������");
	}
	public void charge() {
		System.out.println("����������һԪ/�ţ����ƹ�����");
	}
}		//����������

class Taxi extends MotoVehicles implements MoneyFare,ControlTemperature{
	void brake() {
		System.out.println("���⳵ʹ����ʽɲ������");
	}
	public void charge() {
		System.out.println("���⳵����Ԫ/������3����");
	}
	public void controlAirTemperature() {
		System.out.println("���⳵��װ�˺����յ�");
	}
}		//���⳵��

class Cinema implements MoneyFare,ControlTemperature{
	public  void charge() {
		System.out.println("��ӰԺ��Ʊ��ʮԪ/��");
	}
	public void controlAirTemperature() {
		System.out.println("��ӰԺ��װ������յ�");
	}
}		//��ӰԺ��

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
