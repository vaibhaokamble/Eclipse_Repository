package vaibhao.vk;

import java.util.*;

public class VectorTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v = new Vector<>();
		
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(000);
		v.add(300);
		
		Iterator iterator = v.iterator();
		
	 while (iterator.hasNext()) {
		Object object = iterator.next();
		System.out.println(object);
		
	}
	}

}
