package Example4_8;

//����븴��

public class Exampl4_8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle circle = new Circle();
		circle.setRadius(10);
		Circular circular = new Circular();
		System.out.println("circle�����ã�"+circle);
		System.out.println("Բ׶��bottom������:"+circular.bottom);
		circular.setHeight(5);
		circular.setBottom(circle);
		System.out.println("Բ׶��bottom������:"+circular.bottom);
		System.out.println("Բ׶��volme��"+circular.getVolme());
		System.out.println("�޸�circl�İ뾶��bottom�İ뾶ͬ���仯");
		circle.setRadius(20);
		System.out.println("bottom�İ뾶:"+circular.getBottomRadius());
		System.out.println("���´���circle,circle�����ý������仯");
		circle = new Circle();
		System.out.println("circle������:"+circle);
		System.out.println("���ǲ�Ӱ��circular��bottom������");
		System.out.println("Բ׶��bottom������:"+circular.bottom);
	}

}
