package vaibhao.vk;
import java.util.*;
public class ArrayWithDifferentTypeApp {
	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0] = 100;
		obj[1] = false;
		obj[2] = new java.util.Date();
		obj[3] = 5.4f;
		obj[4] = "good";
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}
}