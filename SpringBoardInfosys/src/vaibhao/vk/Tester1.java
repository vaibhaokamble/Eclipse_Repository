package vaibhao.vk;

import java.util.*;

public class Tester1 {

	public static void main(String[] args) {

		int principal;
		int rate;
		int time;
		Scanner v = new Scanner(System.in);
		System.out.println("Enter the principle :");
		principal = v.nextInt();
		System.out.println("Enter the rate :");
		rate = v.nextInt();
		System.out.println("Enter the time :");
		time = v.nextInt();

		float Simple_Interest = (principal * rate * time)/100;

		System.out.println("The simple interest is :" + Simple_Interest);
	}

}
