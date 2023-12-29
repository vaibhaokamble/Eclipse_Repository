package vaibhao.vk;

import java.util.*;

public class VectorApplication3 {
	public static void main(String[] args) {
		Vector v = new Vector(5,1000);

		System.out.println("Capacity of vector : " + v.capacity());

		v.add(100);

		v.add(200);

		v.add(300);

		v.add(400);

		v.add(600);

		v.add(500);

		System.out.println("New capacity : " + v.capacity());
	}
}
