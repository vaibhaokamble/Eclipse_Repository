package vaibhao.vk;

import java.util.*;

public class VectorMaxApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();

		vector.add(10);
		vector.add(30);
		vector.add(20);
		vector.add(50);

		int length = vector.size();

		int max = (int) vector.get(0);

		for (int i = 0; i < length; i++) {
			Object object = vector.get(i);
			if ((int) object > max) {
				max = (int) object;
			}
		}

		System.out.println(vector);

		System.out.println("The maximum value is : " + max);
	}

}
