package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;

public class MinMaxApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(2);
		al.add(9);
		al.add(12);
		al.add(7);
		Object maxValue=Collections.max(al);
		Object minValue=Collections.min(al);
		System.out.println("Maximum value is  "+maxValue);
		System.out.println("Minimum value is "+minValue);
	}
}
