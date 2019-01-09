package variousProgramInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example1 {

	public void isDistinct(int arr[]) {
		
		arr.toString().toCharArray();

		for (int i = 0; i < arr.length; i++) {

			boolean isDistinct = false;

			for (int j = 0; j < i; j++) {

				if (arr[i] == arr[j]) {

					isDistinct = true;
					break;
				}

			}

			if (!isDistinct) {
				System.out.print(arr[i] + " ");
			}

		}

	}

	public static void main(String[] args) {

		int  a[] = { 12, 76, 23, 65, 87, 12, -43, 0, 23, 0, 34, 32,87 };
		Example1 obj = new Example1();
		 obj.isDistinct(a);

		
	}
}
