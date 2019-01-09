package variousProgramInJava;

import java.util.HashSet;

public class CommonElementinTwoArray {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();

		int arr[] = { 5, 9, 4, 3, 7, 9, 3, 2, 4, 5, 7, 9 };

		int arr1[] = { 5, 1, 4, 8, 4, 6, 8, 9, 3 };

		for (int ele : arr) {

			set.add(ele);
		}

		System.out.println(set);

		for (int ele : arr1) {

			set1.add(ele);
		}

		System.out.println(set1);
		for (int ele : set) {
			

			if (set1.add(ele) == false) {
				System.out.println("Duplicate no is " + ele + " ");
			}
		}
	}
}
