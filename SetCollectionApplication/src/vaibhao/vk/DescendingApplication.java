package vaibhao.vk;

import java.util.NavigableSet;
import java.util.TreeSet;

public class DescendingApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeSet = new TreeSet();
		treeSet.add(4);
		treeSet.add(40);
		treeSet.add(3);
		treeSet.add(23);
		treeSet.add(22);
		treeSet.add(56);
		treeSet.add(32);
		NavigableSet nav=treeSet.descendingSet();
		for(Object obj:nav) {
			System.out.println(obj);
		}
	}
}
