package vaibhao.vk;

class AB {
	AB() {
		System.out.println("I am A class");
	}
}

class BC extends AB {
	BC() {
		System.out.println("I am B class");
	}
}

public class ConsInheritanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BC bc = new BC();
	}

}
