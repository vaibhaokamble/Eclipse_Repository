package vaibhao.vk;

public class NumbweFormat {
	public static void main(String[] args) {
		try {
			String s = "12345 ";
			int a = Integer.parseInt(s);
			System.out.println("A is " + a);
		}

		catch (NumberFormatException ex) {
			System.out.println("Error is " + ex);
		}
	}
}
