
//�ڲ���

class RedCowForm{
	static String formName;
	RedCow cow;
	public RedCowForm() {
		// TODO �Զ����ɵĹ��캯�����
	}
	RedCowForm(String s) {
		cow = new RedCow(150,112,5000);
		formName = s;
	}
	public void showCowMess() {
		cow.speak();
	}
	class RedCow{	//�ڲ��������
		String cowName = "��ţ";
		int height,weight,price;
		public RedCow(int h,int w,int p) {
			// TODO �Զ����ɵĹ��캯�����
			height = h;
			weight = w;
			price = p;
		}	
		void speak() {
			System.out.println("����"+cowName+"���"+height+"cm ����"+weight+"kg,������"+formName);
		}
	}		//�ڲ������
}			//��Ƕ�����

public class Example7_1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		RedCowForm form = new RedCowForm("��ţũ��");
		form.showCowMess();
		form.cow.speak();
	}

}
