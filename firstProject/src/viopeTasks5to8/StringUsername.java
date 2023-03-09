package viopeTasks5to8;

import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter given name: ");
		String name = input.nextLine();
		System.out.print("Enter surname: ");
		String surname = input.nextLine();
		input.close();

		String username = createUsername(name, surname);

		if (username != null) {
			System.out.println("Your username is: " + username);
		} else {
			System.out.println("Not enough letters to create a username!");
		}

	}

	private static String createUsername(String name, String surname) {
		if (name.length() >= 2 && surname.length() >= 3) {
			String username = surname.substring(surname.length() - 3).toLowerCase()
			+ name.substring(0, 2).toLowerCase();
			//String substring(int index, int numberOfCharacters)
			return username;
		} else {
			return null;
		}
	}

}
