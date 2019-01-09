package variousProgramInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PrintDistinctElement {

	public static void main(String[] args) {

		String str = "sandeepkumarsingh";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			boolean isDistinct = false;

			for (int j = 0; j < i; j++) {
				if (ch[i] == ch[j]) {
					isDistinct = true;
					break;
				}
			}
			if (!isDistinct) {

				System.out.print(ch[i] + " ");
			}
		}
	}
}
