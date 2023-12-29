package vaibhao.vk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	public static void main(String[] args) {
		try {
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter value");
			int val = xyz.nextInt();
			int sq = val * val;
			System.out.printf("Square is %d\n", sq);
		} catch (InputMismatchException ex) {
			System.out.println("Error is " + ex);
		}
	}
}
