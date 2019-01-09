package variousProgramInJava;

import java.util.HashSet;

public class CommonElementinHashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();

		int arr[] = { 5, 9, 4, 3, 7, 9, 3, 2, 4, 5, 7, 9 };

		int arr1[] = { 5, 1, 4, 8, 4, 6, 8, 9, 3 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr1.length; j++) {

				if (arr[i] == arr1[j]) {
					set.add(arr[i]);

				}
			}
		}

		for (Integer ele : set) {
			System.out.print(ele+" ");
		}

	}

}
