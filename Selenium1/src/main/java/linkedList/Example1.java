package linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example1 {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("hi");
		al1.add("How are you");
		al1.add("Good Morning");
		al1.add("bye");
		al1.add("Good night");

		ListIterator<String> itr = al1.listIterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

		ListIterator<String> itr1 = al1.listIterator();

		System.out.println("-----------");
		while (itr1.hasPrevious()) {

			System.out.println(itr.previous());
		}

		HashSet<Object> set = new HashSet<Object>();
		set.add("Sandeep");
		set.add(true);
		set.add(45.0087);
		set.add(10000000);

		for(Object abc : set){
			System.out.println(abc);
		}
	}
}
