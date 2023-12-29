package vaibhao.vk;

import java.util.*;
public class CollectionTestApplication {
	public static void main(String args[]) {
		Object obj[] = new Object[5];

		obj[0] = 1;
		obj[1] = false;
		obj[2] = "vaibhao";
		obj[3] = 7.7f;
		obj[4] = new java.util.Date();

		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);

		}
	}

}