package viopeTasks;

import java.util.Scanner;

public class MethodsPrimality {

	public static void main(String[] args) {
		// Enter a positive integer: 36
		// 1 4 6 8 9 10 12 14 15 16 18 20 21 22 24 25 26 27 28 30 32 33 34 35

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int integer = Integer.parseInt(input.nextLine());

		input.close();

		isPrime(integer);

		boolean isNotPrime = false;
		for (int i = 1; i < integer; i++) {
			if (isPrime(i) == false) {
				isNotPrime = true;
				System.out.print(i + " ");
			}
		}
		if (isNotPrime == false) {
			System.out.println("\n" + "Nothing to be printed");
		}
	}

	private static boolean isPrime(int integer) {

		boolean isPrime = true;

		if (integer <= 1) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i <= integer / 2; i++) {
				if ((integer % i) == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}

	}

}
