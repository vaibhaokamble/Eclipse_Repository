package vaibhao.vk;

import java.util.ArrayList;

import java.util.Collections;

public class ReverseApplication {

		public static void main(String[] args) {
			ArrayList al = new ArrayList();
			al.add(5);
			al.add(2);
			al.add(9);
			al.add(12);
			al.add(7);
			System.out.println("Before Reverse ");
			for(Object obj:al) {
				System.out.print(obj+"\t");
			}
			 Collections.reverse(al);
			 System.out.println("\nAfter Reverse ");
				for(Object obj:al) {
					System.out.print(obj+"\t");
				}
		}
	}
