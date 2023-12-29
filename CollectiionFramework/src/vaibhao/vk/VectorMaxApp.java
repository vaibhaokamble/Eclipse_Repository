package vaibhao.vk;

import java.util.*;

public class VectorMaxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();

		vector.add(300);
		vector.add(200);
		vector.add(10);
		vector.add(1000);

		int length = vector.size();

		int max = (int) vector.get(0);

		for (int i = 0; i < length; i++) {
			Object object = vector.get(i);

			max = (int) object;

		}
		System.out.println(vector);
		System.out.println("Maximum value is : " + max);
	}
}
