package collectionsInJava;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example4 {

	public static void main(String[] args) {

		Queue<String> que = new PriorityQueue<String>();

		que.add("test1");
		que.add("test2");
		que.add("test3");
		que.add("test4");

		System.out.println(que.element());
		System.out.println(que.peek());

		Iterator<String> itr = que.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		que.remove();
		que.poll();
		System.out.println("------------");
		Iterator<String> itr1 = que.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("------------");

		System.out.println(que.element());
		System.out.println(que.peek());
	}

}
