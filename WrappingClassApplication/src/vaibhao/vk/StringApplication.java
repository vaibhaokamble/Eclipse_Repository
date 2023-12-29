package vaibhao.vk;

import java.util.*;

public class StringApplication {
	public static void main(String[] args) {
		String s = "abcmnopqrabc";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			Integer count = map.get(s.charAt(i));
			if (count == null) {
				count = new Integer(0);
			}
			++count;
			map.put(s.charAt(i), count);
		}
		Set<Map.Entry<Character, Integer>> set = map.entrySet();
		for (Map.Entry<Character, Integer> d : set) {
			if (d.getValue() > 1) {
				System.out.printf("%c----->%d\n", d.getKey(), d.getValue());
			}
		}
	}
}
