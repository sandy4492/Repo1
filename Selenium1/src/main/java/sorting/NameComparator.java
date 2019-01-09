package sorting;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	public int compare(Customer o1, Customer o2) {
		Customer s1 = (Customer) o1;
		Customer s2 = (Customer) o2;
		return s1.name.compareTo(s2.name);
	}

}
