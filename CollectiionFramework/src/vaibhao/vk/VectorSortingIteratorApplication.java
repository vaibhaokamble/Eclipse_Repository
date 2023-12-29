package vaibhao.vk;

import java.util.*;

public class VectorSortingIteratorApplication {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(5);
		v.add(3);
		v.add(4);
		v.add(1);
		v.add(2);

		System.out.println("Before Sorting");

		System.out.println(v);// before sorting

		for (int i = 0; i < v.size(); i++) {

			for (int j = (i + 1); j < v.size(); j++) {

				Object prev = v.get(i);

				Object next = v.get(j);

				if ((int) prev > (int) next) {

					v.set(i, next);

					v.set(j, prev);

				}
			}
		}

		System.out.println("After Sorting");

		Iterator iterator = v.iterator();

		while (iterator.hasNext()) {
			Object object = iterator.next();

			System.out.println(object);

		}
	}
}
