package vaibhao.vk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapWithCollectionApplication {

	public static void main(String[] args) throws Exception
	{ LinkedHashMap<String,ArrayList> map = new LinkedHashMap<String,ArrayList>();
		ArrayList<String> india = new ArrayList<String>();
		india.add("Rohit");
		india.add("Virat");
		india.add("Hardik");
		ArrayList<String> aus = new ArrayList<String>();
		aus.add("Steve");
		aus.add("Warnar");
		aus.add("Finch");
		map.put("India", india);
		map.put("Aus", aus);
		Set<Map.Entry<String, ArrayList>> data=map.entrySet();
		for(Map.Entry<String, ArrayList> d:data) {
			String teamName=d.getKey();
			System.out.println("========================"+teamName+"========================");
			ArrayList<String>playerList=d.getValue();
			for(String pName:playerList)
			{
				System.out.println(pName);
			}
		}
	}
}
