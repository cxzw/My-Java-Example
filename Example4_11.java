package sy;

//�෽���Լ�����������ַ�

import java.util.*;

public class Example4_11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner (System.in);
		int a [] = {12,34,9,23,45,6,45,90,123,19,34};
		Arrays.sort(a);
		System.out.println("����������Ϊ:"+Arrays.toString(a));
		while(true){
				System.out.println("����������������жϸ������Ƿ���������:");
				int num = scanner.nextInt();
				int index = Arrays.binarySearch(a,num);
				if(index >= 0)
					System.out.println(num+"������������Ϊ"+index+"��Ԫ��ֵ��ͬ");
				else
					System.out.println(num+"�����������κ�Ԫ��֮��ͬ");	
				
		}
	}
}
