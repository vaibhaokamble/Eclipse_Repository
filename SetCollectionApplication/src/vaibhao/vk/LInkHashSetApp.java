package vaibhao.vk;

import java.util.LinkedHashSet;

public class LInkHashSetApp {

		public static void main(String[] args) {
	       LinkedHashSet hs = new LinkedHashSet();
			hs.add(10);
			 hs.add(20);
			 hs.add(35);
			 hs.add(30);
			 hs.add(40);
			 hs.add(45);
			for(Object obj:hs) {
				System.out.println(obj);
			} 
		}
	}
