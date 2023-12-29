package vaibhao.vk;

import java.util.*;

public class VectorAccending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector vector = new Vector<>();

		vector.add(100);

		vector.add(300);

		vector.add(500);

		vector.add(200);

		vector.add(600);

		System.out.println("Before Sorting : ");
		
		System.out.println(vector);

		for (int i = 0; i < vector.size(); i++) {
			for (int j = (i + 1); j < vector.size(); j++) {
				Object prevObject = vector.get(i);

				Object nextObject = vector.get(i);

				if ((int) prevObject > (int) nextObject) {
					vector.set(i, nextObject);
					vector.set(i, prevObject);
				}
			}
		}

		System.out.println("After Sorting : ");

		System.out.println(vector);
	}

}
