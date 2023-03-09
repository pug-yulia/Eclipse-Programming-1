package viopeTasks;

import java.util.Scanner;

public class StringTrio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String word1 = input.nextLine();

		System.out.print("Enter second string: ");
		String word2 = input.nextLine();

		System.out.print("Enter third string: ");
		String word3 = input.nextLine();
		
		input.close();

		if (word1.equals(word2) && word2.equals(word3) && word1.equals(word3)) {
			System.out.println("\n" + "The strings are equal in case-sensitive comparison");
		} else if (word2.equalsIgnoreCase(word1) && word3.equalsIgnoreCase(word1) && word2.equalsIgnoreCase(word3)) {
			System.out.println("\n" + "The strings are equal in case-insensitive comparison");
		} else {
			System.out.println("\n" + "The strings are not equal");
		}

	}

}
