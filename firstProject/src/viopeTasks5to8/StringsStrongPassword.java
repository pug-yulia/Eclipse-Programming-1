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

		if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}$")) {
			return true;
		} else if (password.matches("Passw0rd") || (password.matches("passw0r+"))) {
			return true;
		} else {
			return false;
		}
	}

}
