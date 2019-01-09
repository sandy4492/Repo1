package variousProgramInJava;

import java.util.Arrays;
import java.util.HashSet;

public class IsAnagram {

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "dcab";

		HashSet<Character> set = new HashSet<Character>();
		HashSet<Character> set1 = new HashSet<Character>();

		char[] str1 = s1.toUpperCase().toCharArray();
		char[] str2 = s2.toUpperCase().toCharArray();

		boolean b = Arrays.equals(str1, str2);

		System.out.println("Anagram true");
		System.out.println("-------");
		for (Character ele : str1) {

			set.add(ele);

		}

		for (Character ele : str2) {

			if (set.add(ele) == false) {

				System.out.println("number is anagram");
			}

		}
	}

}
