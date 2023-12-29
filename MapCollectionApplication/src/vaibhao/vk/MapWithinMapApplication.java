package vaibhao.vk;

import java.util.*;

public class MapWithinMapApplication {

	public static void main(String[] args) {
		LinkedHashMap<String, LinkedHashMap<Integer, String>> map;
		map = new LinkedHashMap<String, LinkedHashMap<Integer, String>>();

		LinkedHashMap<Integer, String> cseStud = new LinkedHashMap<Integer, String>();
		cseStud.put(1, "a");
		cseStud.put(2, "b");
		cseStud.put(3, "c");

		LinkedHashMap<Integer, String> etcStud = new LinkedHashMap<Integer, String>();
		etcStud.put(1, "a");
		etcStud.put(2, "b");
		etcStud.put(3, "c");
		map.put("CSE", cseStud);
		map.put("ETC", etcStud);
		Set<Map.Entry<String, LinkedHashMap<Integer, String>>> data = map.entrySet();
		System.out.println("=======================================");
		for (Map.Entry<String, LinkedHashMap<Integer, String>> d : data) {
			String deptName = d.getKey();
			System.out.println(deptName);
			System.out.println("===========================");
			LinkedHashMap<Integer, String> studData = d.getValue();
			Set<Map.Entry<Integer, String>> stud = studData.entrySet();
			for (Map.Entry<Integer, String> s : stud) {
				System.out.println(s.getKey() + "------------->" + s.getValue());
			}
			System.out.println("================================");
		}
	}
}
