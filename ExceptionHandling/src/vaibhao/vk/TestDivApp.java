package vaibhao.vk;

import java.util.Scanner;

public class TestDivApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner vk = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the any two number");
		a = vk.nextInt();
		b = vk.nextInt();
		try {
			c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("Error is " + e);
		}
		System.out.println("logic 1");
		System.out.println("logic 2");
	}

}
