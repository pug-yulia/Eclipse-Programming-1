package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat twoDecimals = new DecimalFormat("0.0");

		double total = 0;
		int count = 0;

		System.out.print("Enter first integer: ");
		int integer = Integer.parseInt(input.nextLine());

		if (integer > 0) {
			total = integer;
			count = 1;
		} else if (integer == 0) {
			System.out.println("\n" + "No positive values");
		}

			while (integer != 0) {
				System.out.print("Enter next integer: ");
				integer = Integer.parseInt(input.nextLine());

				if (integer > 0) {
					total += integer;
					count++;
				}
				if (integer == 0) {
					double result = total / count;
					System.out.println("\n" + "The average of the positive values is " + twoDecimals.format(result));
				}
			}

		
		input.close();
	}

}
