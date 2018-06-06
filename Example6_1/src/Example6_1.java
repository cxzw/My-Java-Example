
interface Computable {
	int MAX = 46;
	int f(int x);
}

class China implements Computable {
	int number;
	public int f(int x) {
		int sum = 0;
		for(int i=1; i<=x; i++) {
			sum +=i;
		}
		return sum;
	}
}

class Japan implements Computable {
	int number;
	public int f(int x) {
		return MAX+x;
	}
}

public class Example6_1 {

	public static void main(String[] args) {
		China zhang = new China();
		Japan henlu 
		= new Japan();
		zhang.number = 32+Computable.MAX;
		henlu.number = 14+Computable.MAX;
		System.out.println("zhang��ѧ��:"+zhang.number+" zhang��ͽ��:"+zhang.f(100));
		System.out.println("henlu��ѧ��:"+henlu.number+" henlu��ͽ��"+henlu.f(100));
	}

}
