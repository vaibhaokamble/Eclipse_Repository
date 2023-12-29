package vaibhao.vk;

import java.util.Scanner;

public class TryFinallyApplication {

	public static void main(String[] args) {

		Scanner vk = new Scanner(System.in);
		try {
			int a, b, c; // handle finally clause
			System.out.println("enter two values");
			a = vk.nextInt();
			b = vk.nextInt();
			c = a / b;
			System.out.println("Division is " + c);

		} finally {
			System.out.println("I can finaly Exicute");
		}
		System.out.println("logic 1");
		System.out.println("logic 2");
		System.out.println("logic 3");
		System.out.println("logic 4");
	}
}
