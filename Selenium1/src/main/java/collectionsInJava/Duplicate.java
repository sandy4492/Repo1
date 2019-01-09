package collectionsInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	String s = "sandeepkumarsinhg";

	public void findDuplicate(String st) {

		char[] str = s.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ele : str) {

			if (charMap.containsKey(ele)) {

				charMap.put(ele, charMap.get(ele) + 1);

			} else {
				charMap.put(ele, 1);
			}

		}

		Set<Character> listKey = charMap.keySet();

		for (Character ele : listKey) {
			if (charMap.get(ele) > 1) {

				System.out.println(ele + "-----" + charMap.get(ele));
			}

		}

	}

	public static void main(String[] args) {
		Duplicate obj = new Duplicate();
		obj.findDuplicate(obj.s);

	}

}
