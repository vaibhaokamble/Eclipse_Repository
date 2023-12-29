package vaibhao.vk;

class Div {
	void setValue(int x, int y) throws ArithmeticException, ClassNotFoundException {
		System.out.println("Division is " + (x / y));
	}
}

public class ArrayIndexApplication2 {
	public static void main(String[] args) {
		try {
			Div d = new Div();
			d.setValue(5, 0);
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
		}
	}
}
