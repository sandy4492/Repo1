package variousProgramInJava;

public class MaxNumberInArray {

	public void maxnumber(int[] arr) {

		int firstno = 0;
		int secondno = 0;

		for (int ele : arr) {

			if (firstno < ele) {
				secondno = firstno;
				firstno = ele;

			}

			else if (secondno < ele) {
				secondno = ele;
			}

		}
		System.out.println("firstbiggest number is " + firstno);
		System.out.println("secondbiggest number is " + secondno);
	}

	public static void main(String[] args) {

		int a[] = { 5, 34, 78, 9, 89, 99 };
		MaxNumberInArray obj = new MaxNumberInArray();

		obj.maxnumber(a);

	}

}
