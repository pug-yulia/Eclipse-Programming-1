package viopeTasks5to8;

import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String number = input.nextLine();

		if (number.substring(0, 1).matches("2") && number.length() == 8) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}
		
		input.close();
	}
}
