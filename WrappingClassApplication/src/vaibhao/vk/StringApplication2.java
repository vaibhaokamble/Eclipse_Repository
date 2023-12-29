package vaibhao.vk;

import java.util.*;

public class StringApplication2 {
	public static void main(String[] args) {
		String str = "good morning good afternoon india good evening india";
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			Integer len = map.get(words[i]);
			if (len == null) {
				len = new Integer(0);
			}
			len = words[i].length();
			map.put(words[i], len);
		}
		System.out.println("Display all words and its length");
		Set<Map.Entry<String, Integer>> data = map.entrySet();
		for (Map.Entry<String, Integer> s : data) {
			System.out.println(s.getKey() + "------------>" + s.getValue());
		}

	}
}
