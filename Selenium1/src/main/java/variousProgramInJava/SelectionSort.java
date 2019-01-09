package variousProgramInJava;

public class SelectionSort {

	public static int[] doSelectionSort(int str[]) {

		for (int i = 0; i < str.length - 1; i++) {

			int index = i;
			for (int j = i + 1; j < str.length; j++) {
				if (str[j] < str[index]) {
					index = j;
				}
			}
			int temp = str[index];
			str[index] = str[i];
			str[i] = temp;
		}

		return str;

	}

	public static void main(String[] args) {

		int str[] = { 10, 34, 2, 5, 6, 66, 88 };

		int array[] = doSelectionSort(str);
		for (int ele : array) {

			System.out.print(ele + " ");
		}

	}

}
