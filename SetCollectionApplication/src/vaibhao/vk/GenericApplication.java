package vaibhao.vk;

import java.util.ArrayList;

public class GenericApplication {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("ABC");
		al.add(5.4f);
		al.add(false);
		al.add(50);
		int sum=0;
		for(Object obj:al) {
			if(obj instanceof Integer) {
			    sum=sum+(int)obj;
			}
		}	System.out.println("Sum of all element is "+sum);
	}
}
