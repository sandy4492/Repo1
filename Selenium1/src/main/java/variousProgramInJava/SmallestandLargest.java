package variousProgramInJava;

public class SmallestandLargest {

	public static void main(String[] args) {

		int a[] = { -20,0,10, 30, 20, 45, 87 };

		int largest = a[0];
		int smallest= a[0];

		for (int ele : a) {

			if (largest < ele) {

				largest = ele;
			}

			else if (smallest > ele) {

				smallest = ele;
			}

		}

		System.out.println("largest number is " + largest);
		System.out.println("smallest number is " + smallest);

	}

}
