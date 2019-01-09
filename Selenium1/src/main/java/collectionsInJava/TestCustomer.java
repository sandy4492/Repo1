package collectionsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestCustomer {

	public static void main(String[] args) {

		Customer cus = new Customer(23, "sandeep", 2500, "Delhi");
		Customer cus2 = new Customer(25, "ravi", 70000, "Goa");
		Customer cus3 = new Customer(29, "singh", 3547, "Bihar");
		Customer cus4 = new Customer(29, "singh", 3547, "Bihar");

		List<Customer> list = new ArrayList<Customer>();

		list.add(cus);
		list.add(cus2);
		list.add(cus3);

		Iterator<Customer> itr = list.iterator();

		while (itr.hasNext()) {

			Customer st = (Customer) itr.next();

			System.out.println(st.age + " " + st.are);
		}
		System.out.println("===============");

		for (Customer cst : list) {

			System.out.println(cst.age + " " + cst.are + " " + cst.money + " " + cst.name);
		}
		System.out.println("--------------------");
		HashSet<Customer> set = new HashSet<Customer>();
		set.add(cus);
		set.add(cus2);
		set.add(cus3);

		Iterator<Customer> it = set.iterator();

		while (it.hasNext()) {

			Customer str = (Customer) it.next();

			System.out.println(str.age + " " + str.money);
		}
		System.out.println("=============");
		for (Customer abc2 : set) {
			System.out.println(abc2.age + " " + abc2.are + " " + abc2.money + " " + abc2.name);
		}
		System.out.println("-----------------------------------------");

	}
}
