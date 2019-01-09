package sortingInArray;

import java.util.Comparator;

public class AreaComparator implements Comparator {

	public int compare(Object s1, Object s2) {

		Customer o1 = (Customer) s1;
		Customer o2 = (Customer) s2;

		return o1.area.compareTo(o2.area);

	}

}
