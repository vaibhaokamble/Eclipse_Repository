package vaibhao.vk;

import java.util.*;

public class ArratListApplication {

	public static void main(String[] args) {

// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add(100);

		al.add(200);

		al.add(300);

		al.add(400);

		LinkedList lst = new LinkedList(al);

		for (Object obj : lst)

		{

			System.out.println(obj);

		}
	}
}
