package viopeTasks5to8;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String username = input.nextLine();
		System.out.print("Enter password: ");
		String password = input.nextLine();

		System.out.println(checkStrength(username, password));
		input.close();

	}

	private static String checkStrength(String username, String password) {
		if (password.length() < 9) {
			return "NOT OK";
		} else if (password.toLowerCase().contains(username.toLowerCase())) {
			return "NOT OK";
		} else if (password.equalsIgnoreCase(username)) {
			return "NOT OK";
		} else {
			return "OK";
		}

	}

}
