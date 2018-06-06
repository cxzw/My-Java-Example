

//重写以及用super操作被隐藏的成员变量

class Sum {
/*	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}*/
	int n;
	float f() {
		float sum = 0;
		for (int i=1; i<=n; i++) {
			sum += i;
		}
		return sum;
	}
}

class Average extends Sum{
/*	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}*/
	//int n;
	float f() {
		float c;
		c = super.f();
		return c/n;	
	}
	float g() {
		float c;
		c = super.f();
		return c/2;
	}
}

public class Example5_7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Average aver = new Average();
		//aver.setN(100);
		aver.n = 100;
		float resultOne = aver.f();
		float resultTwo = aver.g();
		System.out.println("resultOne="+resultOne);
		System.out.println("resultTwo="+resultTwo);
	}

}
