package sy;

//类方法以及数组排序二分法

import java.util.*;

public class Example4_11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner (System.in);
		int a [] = {12,34,9,23,45,6,45,90,123,19,34};
		Arrays.sort(a);
		System.out.println("排序后的数组为:"+Arrays.toString(a));
		while(true){
				System.out.println("输入整数，程序会判断该整数是否在数组中:");
				int num = scanner.nextInt();
				int index = Arrays.binarySearch(a,num);
				if(index >= 0)
					System.out.println(num+"和数组中索引为"+index+"的元素值相同");
				else
					System.out.println(num+"不与数组中任何元素之相同");	
				
		}
	}
}
