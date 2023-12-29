package vaibhao.vk;

import java.util.*;

public class VectorApplicationMain {

	public static void main(String[] args) {

		int choice;
		Vector v = new Vector();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1 : Enter the value in collection");
			System.out.println("3 : Enter the Element for searching in Collection");
			System.out.println("4 : Enter the element for remove");
			System.out.println("5 : Number of element in Vector " + v.size());
			System.out.println("6 : Enter the index for replacement");
			System.out.println("7 : Enter the index for replacement");
			System.out.println("8 : Exit the programme");
			choice = xyz.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Enter the value in collection");
				int val = xyz.nextInt();
				v.add(val);
				break;

			case 2:
				for (int i = 0; i < v.size(); i++) {
					System.out.println(v.get(i));
				}
				break;

			case 3:
				System.out.println("Enter the Element for searching in Collection");
				val = xyz.nextInt();
				boolean b = v.contains(val);
				if (b) {
					System.out.println("Element Found " + val);
				} else {
					System.out.println("Element not found ");
				}
				break;

			case 4:
				System.out.println("Enter the element for remove");
				int value = xyz.nextInt();
				int index = v.indexOf(value);
				if (index != -1) {
					v.remove(index);
				} else {
					System.out.println("Element Not Present in collection remove");
				}
				break;

			case 5:
				System.out.println("Number of element in Vector " + v.size());
				break;

			case 6:
				System.out.println("enter the index for replacement");
				index = v.size();
				if (index <= (v.size() - 1)) {
					System.out.println("Enter the value for replacement");
					val = xyz.nextInt();
					v.set(index, val);
				} else {
					System.out.println("Index not present");
				}
				break;

			case 7:
				System.out.println("enter the index for replacement");
				index = v.size();
				if (index <= (v.size() - 1)) {
					System.out.println("Enter the value for replacement");
					val = xyz.nextInt();
					v.insertElementAt(val, index);
				} else {
					System.out.println("Index not present");
				}
				break;

			case 8:
				System.exit(0);
				break;
			default:

				System.out.println("Wrong chocie");
			}
		} while (true);
	}
}