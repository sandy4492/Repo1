package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();

		list.add(new Customer(54, "sandeep", "Delhi", 569876));
		list.add(new Customer(54, "kumar", "Goa", 34563));
		list.add(new Customer(54, "ravi", "Bihar", 49876));

		System.out.println("------sorting by salary-----");

		Collections.sort(list, new SalaryComparator());

		Iterator<Customer> str = list.iterator();
		while (str.hasNext()) {

			Customer st = (Customer) str.next();
			System.out.println(st.salary + " " + st.age + " " + st.area + " " + st.name);
		}

		System.out.println("----------sorting by name----------------");

		Collections.sort(list, new NameComparator());

		for (Customer ele : list) {

			System.out.println(ele.name + " " + ele.age + " " + ele.area + " " + ele.salary);
		}

	}

}
