package viopeTasks5to8;

import java.util.Scanner;

public class StringsStrongPassword {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter password: ");
		String password = input.nextLine();

		input.close();

		if (checkStrength(password) == true) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}

	}

	private static boolean checkStrength(String password) {
		
		
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;
		int otherCount = 0;

		for (int i = 0; i < password.length(); i++) {
			
			if (Character.isUpperCase(password.charAt(i))) {
				uppercaseCount = 1;
			} else if (Character.isLowerCase(password.charAt(i))) {
				lowercaseCount = 1;
			} else if (Character.isDigit(password.charAt(i))) {
				digitCount = 1;
			} else {
				otherCount = 1;
			}
		}

		int sum = uppercaseCount + lowercaseCount + digitCount + otherCount;
		return password.length() >= 8 && sum >= 3;
			
		
	}

}
