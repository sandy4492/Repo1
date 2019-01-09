package variousProgramInJava;

public class CalculateSumOfArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };

		CalculateSumOfArray obj = new CalculateSumOfArray();
		obj.test(a);

		
	}

	public int test(int[] arr) {

		int temp = 0;

		for (int ele : arr) {

			temp = temp + ele;

		}
		return temp;
	}

}
