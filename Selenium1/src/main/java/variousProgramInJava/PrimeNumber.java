package variousProgramInJava;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 89;
		int temp = 0;
		for (int i = 2; i <= num - 1; i++) {

			if (num % i == 0) {
				temp = temp + 1;

			}
		}

		if (temp > 0) {
			System.out.println(num + "  is not a prime number");
		}

		else {
			System.out.println(num + " is a prime number");
		}

	}

}
