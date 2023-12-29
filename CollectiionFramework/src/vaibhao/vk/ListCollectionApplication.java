package vaibhao.vk;

import java.util.*;

public class ListCollectionApplication {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		a.add(1000);
		a.set(3, 6000);
		a.add(3, 9000);
		
		for(int i=0; i<a.size(); i++) {
			Object obj = a.get(i);
			
			System.out.println(obj);
		}
		
	}

}
