package viopeTasks;

import java.util.Scanner;

public class MethodsTriplex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a positive integer: ");
		int integer = Integer.parseInt(input.nextLine());

		input.close();

		for (int i = 1; i <= integer; i++) {
			System.out.println("triplex(" + i + ") = " + triplex(i));
		}

	}

	private static int triplex(int integer) {

		int sum = 1;

		for (int i = 1; i < integer; i = i + 3) {
			sum = sum * i;
		}
			sum = sum * integer;
		return sum;

	}

}
