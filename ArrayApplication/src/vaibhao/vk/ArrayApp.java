package vaibhao.vk;

public class ArrayApp {
	public static void main(String x[]) {
		int a[] = new int[] { 10, 20, 30, 40, 50 };
		show(a, 0);
		System.out.println("Display array values");
//10 1 30 40 50
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] >> 1); // 5 0 10 15 20 25
		}
	}

	public static int[] show(int m[], int count) {
		m[1] = 4 >> 2;
		return m;// return base address of array
	}
}