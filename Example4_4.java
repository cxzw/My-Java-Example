package sy;

class point{
	int x,y;
	void setXY(int m, int n) {
		x = m;
		y = n;
	}
}

public class Example4_4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		point p1,p2;
		p1 = new point();
		p2 = new point();
		System.out.println("p1������:"+p1);
		System.out.println("p2������:"+p2);
		p1.setXY(1111, 2222);
		p2.setXY(-1111, -2222);
		System.out.println("p1��x,y����Ϊ:"+p1.x+","+p1.y);
		System.out.println("p2��x,y����Ϊ:"+p2.x+","+p2.y);
		p1 = p2;
		System.out.println("��p2�����ø���p1��");
		System.out.println("p1������:"+p1);
		System.out.println("p2�����ã�"+p2);
		System.out.println("p1��x,y����Ϊ:"+p1.x+","+p1.y);
		System.out.println("p2��x,y����Ϊ:"+p2.x+","+p2.y);
	}

}
