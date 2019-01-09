package variousProgramInJava;

import java.util.HashMap;
import java.util.Set;

public class DuplicateChar {

	String s1 = "sandeepkumarsingh";

	public void duplicateCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		char[] st = s1.toCharArray();

		for (Character ele : st) {
			if (map.containsKey(ele)) {

				map.put(ele, map.get(ele) + 1);
			} else {
				map.put(ele, 1);
			}
		}
		Set<Character> list = map.keySet();

		for (Character ele : list) {

			if (map.get(ele) > 1) {

				System.out.println(ele + "------------" + map.get(ele));
			}
		}

	}

	public static void main(String[] args) {
		DuplicateChar obj = new DuplicateChar();
		obj.duplicateCharacter(obj.s1);
	}
}