package vaibhao.vk;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollcetionApp2 {
	public static void main(String[] args) {	
		 HashSet hs = new HashSet(10,0.5f);
		 hs.add(10);
		 hs.add(20);
		 hs.add(30);
		 hs.add(40);
		 hs.add(45);
		 hs.add(23);
		 hs.add(67);
		 hs.add(98);
		 hs.add(423);
		 hs.add(90);
		 hs.add(10);
		 hs.add(20);
		 Iterator i = hs.iterator();
		 while(i.hasNext()) {
			 Object obj = i.next();
			 System.out.println(obj);
		 }
	}
}
