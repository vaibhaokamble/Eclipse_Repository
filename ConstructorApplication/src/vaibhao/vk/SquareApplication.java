package vaibhao.vk;

import java.util.*;

class Square {
	int no;

	Square(int no) {
		this.no = no;
	}

	int getSquare() {
		return no * no;
	}
}

public class SquareApplication {
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number");
		int no = xyz.nextInt();
		Square s1 = new Square(no);
		int result = s1.getSquare();
		System.out.println("Square is " + result);
	}
}
