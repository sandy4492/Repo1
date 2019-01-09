package sortingInArray;

import java.util.Comparator;

public class AgeComparator implements Comparator<Object> {

	public int compare(Object s1, Object s2) {
		Customer o1 = (Customer) s1;
		Customer o2 = (Customer) s2;

		if (o1.age == o2.age) {
			return 0;
		} else if (o1.age > o2.age)
			return 1;
		
		else {
			return -1;
		}

	}

}
