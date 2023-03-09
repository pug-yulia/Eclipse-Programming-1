package viopeTasks;

import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("What is 2 + 3? ");
		String num = input.nextLine();
		int numInt;

		while (true) {
			try {
				numInt = Integer.parseInt(num);

				if (numInt == 5) {
					System.out.println("Correct!");
					break;
				} else {
					System.out.print("Incorrect! Try again: ");
					num = input.nextLine();
				}

			} catch (NumberFormatException nfe) {
				System.out.print("That is not a number! Try again: ");
				num = input.nextLine();
			}
		}
		input.close();
	}
}