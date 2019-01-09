package collectionsInJava;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableininJava {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();

		table.put(11, "sandeep");
		table.put(112, "sandeep");
		table.put(113, "sandeep");

		for (Entry m : table.entrySet()) {

			System.out.println(m.getValue() + " " + m.getKey());
		}

	}
}
