package vaibhao.vk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedApp {

			public static void main(String[] args) {
				ArrayList al = new ArrayList();
				al.add(5);
				al.add(2);
				al.add(9);
				al.add(12);
				al.add(7);
			List list=Collections.synchronizedList(al);
			//here list reference is synchronized.
			System.out.println(al);
			}
		}

	
