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
		// TODO 自动生成的方法存根
		point p1,p2;
		p1 = new point();
		p2 = new point();
		System.out.println("p1的引用:"+p1);
		System.out.println("p2的引用:"+p2);
		p1.setXY(1111, 2222);
		p2.setXY(-1111, -2222);
		System.out.println("p1的x,y坐标为:"+p1.x+","+p1.y);
		System.out.println("p2的x,y坐标为:"+p2.x+","+p2.y);
		p1 = p2;
		System.out.println("将p2的引用赋给p1后：");
		System.out.println("p1的引用:"+p1);
		System.out.println("p2的引用："+p2);
		System.out.println("p1的x,y坐标为:"+p1.x+","+p1.y);
		System.out.println("p2的x,y坐标为:"+p2.x+","+p2.y);
	}

}
