package vaibhao.vk;

import java.util.*;

public class SearchRemoveApp {
	public static void main(String[] args) {
		Vector v = new Vector();
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter value count which want to store in colelction");
		int count=xyz.nextInt();
		for(int i=1; i<=count;i++) {
			int value=xyz.nextInt();
			v.add(value);
		}
		System.out.println("Before remove  "+v);
		System.out.println("Enter value for delete");
		int value=xyz.nextInt();
		int index=v.indexOf(value);
		if(index!=-1) {
			v.remove (index);
			System.out.println ("Element removed success..............");
		}
		else {
		      System.out.println ("Data not found");
		}
		System.out.println ("After Remove "+v);	
	}
}
