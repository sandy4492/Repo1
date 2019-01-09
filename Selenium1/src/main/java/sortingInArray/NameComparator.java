package sortingInArray;

import java.util.Comparator;

public class NameComparator implements Comparator {

	public int compare(Object s1, Object s2) {
	      Customer o1 = (Customer)s1;
	      Customer o2 = (Customer)s2;
	      
	     return o1.name.compareTo(o2.name);
	}

}
