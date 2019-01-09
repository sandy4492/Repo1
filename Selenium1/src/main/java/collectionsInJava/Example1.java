package collectionsInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {

	public static void main(String[] args) {

		List list = new ArrayList();

		List<String> list1 = new LinkedList<String>();

		ArrayList abc = new ArrayList();

		ArrayList<Integer> dd = new ArrayList<Integer>();
		LinkedList<String> ff = new LinkedList<String>();

		Set set = new HashSet();

		HashSet set1 = new HashSet();
		HashSet<Object> set3 = new HashSet<Object>();

		Map map = new HashMap();

		Map<Integer, String> m2 = new HashMap<Integer, String>();

	}

}
