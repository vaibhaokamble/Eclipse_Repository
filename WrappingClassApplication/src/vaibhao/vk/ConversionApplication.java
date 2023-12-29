package vaibhao.vk;

import java.util.*;

public class ConversionApplication {
	public static void main(String[] args) {
		long a;
		int b = 100;
		a = b;// implicit conversion
		System.out.println("A is " + a);
		long c = 200;
		int d;
		d = (int) c;// explicit conversion
		System.out.println("D is : "+d);
	}
}
