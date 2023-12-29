package vaibhao.vk;

public class ArrayIndexApplication1 {
	static int a[];

	public static void main(String[] args) {
		try {
			a[0] = 100;
			System.out.println(a[0]);
		} catch (NullPointerException ex) {
			System.out.println(ex);
		}
	}
}
