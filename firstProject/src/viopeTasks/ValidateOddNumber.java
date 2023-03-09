package viopeTasks;

import java.util.Scanner;

public class ValidateOddNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an odd number: ");
		String num = input.nextLine();
		int numInt;
		
		input.close();
		
		try {
			numInt = Integer.parseInt(num);

			if (numInt % 2 != 0) {
				System.out.println("\n" + "Ok");
			} else {
				System.out.println("\n" + numInt + " is not an odd number");
			}

		} catch (NumberFormatException nfe) {
			System.out.println("\n" + "\'" + num + "\'" + " is not an integer");
		}
	}

}
