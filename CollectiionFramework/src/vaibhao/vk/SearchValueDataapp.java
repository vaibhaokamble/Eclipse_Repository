package vaibhao.vk;

import java.util.*;

public class SearchValueDataapp {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("Enter value in collection");
		Scanner xyz = new Scanner(System.in);
		do {
			int value = xyz.nextInt();
			v.add(value);
			xyz.nextLine();
			System.out.println("Do you want to stop");
			String msg = xyz.nextLine();
			if (msg.equals("yes")) {
				break;
			}

		} while (true);
		System.out.println("Enter data for search");
		int data = xyz.nextInt();
		int index = v.indexOf(data);
		if (index != -1) {
			System.out.println("Data found");
		} else {
			System.out.println("Data not found");
		}
	}
}
