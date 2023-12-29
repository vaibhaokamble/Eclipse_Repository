package vaibhao.vk;

public class ArrayIndexApplication {

	public static void main(String[] args) {
		try {
			int a[] = new int[2]; // 0 and 1 index
			a[2] = 200;
			System.out.println("value is " + a[2]);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Error is " + ex);
		}
	}
}
