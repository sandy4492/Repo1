package variousProgramInJava;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10;
		int firstnumber = 0;
		int secondnumber = 1;
		for (int i = 0; i < num; i++) {

			int thirdnumber = firstnumber + secondnumber;
			System.out.print(thirdnumber + " ");

			firstnumber = secondnumber;
			secondnumber = thirdnumber;
		}

	}

}
