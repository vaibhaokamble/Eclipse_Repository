package vaibhao.vk;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollectionApp {
	public static void main(String[] args) {	
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(20);
		HashSet hs = new HashSet(al);
		al.clear(); //remove all elements 
		al.addAll(hs);
		System.out.println(al);
	}
}
