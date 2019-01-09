package collectionsInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

import javax.swing.text.Element;

public class TestCoustermerHashMap {

	public static void main(String[] args) {

		HashMap<Integer, Customer> map = new HashMap<Integer, Customer>();

		map.put(1, new Customer(24, "sandeep", 250000, "Bihar"));
		map.put(2, new Customer(25, "sandeep", 250000, "Bihar"));
		map.put(3, new Customer(26, "sandeep", 250000, "Bihar"));
		
		
	
		
		

		for (Entry m : map.entrySet()) {

			Customer st = (Customer) m.getValue();

			System.out.println(m.getKey() + " " + st.age + " " + st.money + " " + st.name);
		}

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(1, "Delhi");
		map2.put(2, "Bangalore");
		map2.put(3, "Kolkata");
		
		
		System.out.println(map2.get(2));

		for (Entry m2 : map2.entrySet()) {

			System.out.println(m2.getKey() + " " + m2.getValue());
		}

	}

}
