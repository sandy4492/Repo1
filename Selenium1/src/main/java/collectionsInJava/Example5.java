package collectionsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example5 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Test1", 90);
		map.put("Test2", 80);

		map.put("Test3", 85);
		map.put("Test4", 95);

		for (Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getValue() + " " + m.getKey());
		}
	}

}
