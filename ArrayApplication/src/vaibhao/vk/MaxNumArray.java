package vaibhao.vk;

import java.util.*; //step1

public class MaxNumArray {
	public static void main(String x[]) {
		Scanner v = new Scanner(System.in);
		int a[]; // declaration
		a = new int[5];
		System.out.println("Enter values in array");
		for (int i = 0; i < a.length; i++) {
			a[i] = v.nextInt();
		}
		int max = a[0];
		System.out.println("Display array values");
		for (int i = 0; i < a.length; i++) {
			System.out.printf("a[%d] ---->%d\n", i, a[i]);
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.printf("Maximum value is %d\n", max);
	}
}