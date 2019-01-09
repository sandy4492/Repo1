package collectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sandeep");
		list.add("kumar");
		list.add("singh");
		int length = list.size();

		System.out.println(list);
		list.add(1, "ravi");
		System.out.println(list);

		for (int i = 0; i < length; i++) {

			System.out.println(list.get(i));
		}
		System.out.println("-----------------");
		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("++++++++++++++++");

		for (String abc : list) {
			System.out.println(abc);
		}
	}

}
