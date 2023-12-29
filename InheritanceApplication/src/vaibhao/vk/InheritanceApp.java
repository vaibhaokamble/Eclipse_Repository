package vaibhao.vk;

class A {
	int m = 10;
}

class B extends A {
	int n = 20;
}

public class InheritanceApp {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(" M is a :" + b1.m);
		System.out.println("N is a :" + b1.n);

	}

}
