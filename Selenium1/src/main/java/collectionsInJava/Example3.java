package collectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<Object>();
		list.add("sandeep");
		list.add(4567);
		list.add(true);
		list.add(45.00);

		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

}
