package vaibhao.vk;

import java.util.*;

public class IteratorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();

		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);

		Iterator i = al.iterator();

		while (i.hasNext()) {
			Object obj = i.next();

			System.out.println(obj);
		}
		int s = al.size();
		System.out.println(s);
		boolean b = al.isEmpty();
		boolean b1=al.contains(50);
		System.out.println(b1);
		if (b) {
			System.out.println("Array is empty");
		} else {
			System.out.println("Array is not empty");
		}
	}
}
