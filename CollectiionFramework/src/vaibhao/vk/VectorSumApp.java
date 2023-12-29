package vaibhao.vk;

import java.util.*;

public class VectorSumApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();
		
		vector.add(100);
		vector.add(200);
		vector.add(20);
		
		int len = vector.size();
		
		int sum=0;
		
	   for (int i = 0; i <len; i++) {
		Object object = vector.get(i);
		sum = sum+(int)object;
		
	}
	   
	   System.out.println("sum of all element is : "+sum);
	}

}
