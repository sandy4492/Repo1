package sortingInArray;

import java.util.Comparator;

public class MoneyComparator implements Comparator {

	public int compare(Object s1, Object s2) {
		Customer o1 = (Customer) s1;
		Customer o2 = (Customer) s2;

		if (o1.money == o2.money) {
			return 0;

		} else if (o1.money > o2.money)
			return 1;

		else {
			return -1;
		}

	}

}
