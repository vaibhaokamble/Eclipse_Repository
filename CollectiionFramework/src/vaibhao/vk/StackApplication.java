package vaibhao.vk;

import java.util.*;

public class StackApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1:Add New Element");
			System.out.println("2:View All Element");
			System.out.println("3:Remove Top Most element");
			System.out.println("4:Peek Top Most element");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter value in Stack");
				int value = xyz.nextInt();
				s.push(value);
				break;
			case 2:
				ListIterator li = s.listIterator(s.size());
				while (li.hasPrevious()) {
					Object obj = li.previous();
					System.out.println(obj);
				}
				break;
			case 3:
				boolean b = s.isEmpty();
				if (b) {
					System.out.println("Stack is empty");
				} else {
					Object obj = s.pop();
					System.out.println("Delete value is " + obj);
				}
				break;
			case 4:
				b = s.isEmpty();
				if (b) {
					System.out.println("Stack is empty");
				} else {
					Object obj = s.peek();
					System.out.println("Top value is " + obj);
				}
				break;
			default:
				System.out.println("wrong choice");
			}
		} while (true);// infinite loop
	}
}
