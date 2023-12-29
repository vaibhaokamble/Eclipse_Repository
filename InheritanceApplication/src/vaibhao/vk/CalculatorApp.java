package vaibhao.vk;

class Value {
	int a, b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}

class Add extends Value {
	void showAdd() {
		System.out.println("Addition is :" + (a + b));
	}
}

class Mul extends Value {
	void showMul() {
		System.out.println("Multiplication is :" + (a * b));
	}
}

class Sub extends Value {
	void showSub() {
		System.out.println("Substraction is :" + (a - b));
	}
}

class Div extends Value {
	void showDiv() {
		System.out.println("Division is :" + (a / b));
	}
}

public class CalculatorApp {

	public static void main(String[] args) {

		Add a = new Add();
		a.setValue(10, 20);
		a.showAdd();

		Mul m = new Mul();
		m.setValue(10, 20);
		m.showMul();

		Sub s = new Sub();
		s.setValue(10, 20);
		s.showSub();

		Div d = new Div();
		d.setValue(10, 20);
		d.showDiv();
	}

}
