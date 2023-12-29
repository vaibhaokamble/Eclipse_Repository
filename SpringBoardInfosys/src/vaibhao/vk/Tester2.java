package vaibhao.vk;

import java.util.*;

class Tester2 {

	public static void main(String srgs[]) {
		int radius;
		float area;
		float pi = 3.14f;

		Scanner v = new Scanner(System.in);

		System.out.println("Enter the radius of circle : ");

		radius = v.nextInt();

		area = pi * radius * radius;

		System.out.println("the area of circle is :" + area);
	}

}