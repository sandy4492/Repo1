package collectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass {

	public static void main(String[] args) {

		Person p1 = new Person(23, 25000, "sandy");
		Person p2 = new Person(24, 29000, "ravi");
		Person p3 = new Person(25, 27000, "singh");

		ArrayList<Person> list = new ArrayList<Person>();

		list.add(p1);
		list.add(p2);
		list.add(p3);

		Iterator<Person> itr = list.iterator();
		while (itr.hasNext()) {
			Person st = (Person) itr.next();

			System.out.println(st.age + " " + st.name + " " + st.salary);
		}
	}

}
