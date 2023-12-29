package vaibhao.vk;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApplication1 {
	public static void main(String[] args) {
		LinkedHashMap <Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(4, "ABC");
		map.put(5, "MNO");
		map.put(2, "PQR");
		map.put(23, "ABC");
		map.put(56, "STV");
		map.put(76, "XYZ");
		map.put(234, "STV");
		map.put(897, "ABCD");
		map.put(6789, "POQSS");
		map.put(54, "SSSS");
		map.put(4, "YYYYY");
		map.put(67, "YYTTT");
		map.put(56, "OOOOOOO");
		map.put(44, "PPPPPPPPPPP");
		Set<Map.Entry<Integer, String>> data=map.entrySet();
		for(Map.Entry<Integer, String> v:data) {
			System.out.println(v.getKey()+"---------->"+v.getValue());
		}
		
	}
}
