package sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Customer> {

	public int compare(Customer o1, Customer o2) {
		Customer s1 = (Customer) o1;
		Customer s2 = (Customer) o2;

		if (s1.age == s2.age) {
			return 0;
		} else if ((s1.age > s2.age))
			return 1;

		else {
			return -1;
		}
	}

}
