package vaibhao.vk;

import java.util.*;

public class LinkListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList linkedList = new LinkedList<>();
		
		linkedList.add(200);
		
		linkedList.add(100);
		
		linkedList.add(300);
		
		linkedList.add(400);
		
		Iterator iterator = linkedList.iterator();
		
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
