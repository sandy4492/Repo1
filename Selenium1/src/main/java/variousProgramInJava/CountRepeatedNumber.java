package variousProgramInJava;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatedNumber {

	public static void main(String[] args) {
		int[] a = { 355, 655, 667 };

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < a.length; i++) {

			char[] ar = String.valueOf(a[i]).toCharArray();

			for (Character ele : ar) {
				if (map.containsKey(ele)) {

					map.put(ele, map.get(ele) + 1);
				} else {
					map.put(ele, 1);

				}
			}
		}

		Set<Character> list = map.keySet();

		for (Character ele : list) {
			System.out.println(ele + "-" + map.get(ele));
		}

	}

}
