package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;

public class SortingApplication {
		public static void main(String[] args) {
			ArrayList al = new ArrayList();
			al.add(5);
			al.add(2);
			al.add(9);
			al.add(12);
			al.add(7);
			System.out.println("Before Sorting");
			for(Object obj:al) {
				System.out.println(obj);
			}
			Collections.sort(al);
			System.out.println("\nAfter Sorting");
			for(Object obj:al) {
				System.out.println(obj);
			}
		}
	}