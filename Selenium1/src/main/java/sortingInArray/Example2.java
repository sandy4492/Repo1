package sortingInArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example2 {

	public static void main(String[] args) {

		ArrayList<Customer> list = new ArrayList<Customer>();
		// Customer cust = new Customer(23,"sandeep",2345,"Delhi");

		list.add(new Customer(23, "sandeep", 2300, "Bihar"));
		list.add(new Customer(56, "kumar", 5678, "Goa"));
		list.add(new Customer(76, "ravi", 2345, "Delhi"));

		Collections.sort(list, new AreaComparator());

		Iterator<Customer> itr4 = list.iterator();

		while (itr4.hasNext()) {

			Customer st_1 = (Customer) itr4.next();
			System.out.println(st_1.area);
		}

		System.out.println("Sorting by Name");

		Collections.sort(list, new NameComparator());

		Iterator<Customer> itr = list.iterator();

		while (itr.hasNext()) {

			Customer cst = (Customer) itr.next();
			System.out.println(cst.name + " " + cst.age + " " + cst.money + " " + cst.area);

		}
		System.out.println("Sorting by age-----");

		Collections.sort(list, new AgeComparator());

		Iterator<Customer> itr1 = list.iterator();

		while (itr1.hasNext()) {

			Customer gst = (Customer) itr1.next();
			System.out.println(gst.age + " " + gst.money + " " + gst.area + " " + gst.name);

		}

	}

}
