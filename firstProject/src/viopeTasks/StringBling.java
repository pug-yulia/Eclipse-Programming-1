package viopeTasks;

import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String word1 = input.nextLine();

		if (word1.equalsIgnoreCase("STOP")) {
			System.out.println("Nothing to be printed");
		}

		String winWord = "";

		if (word1.length() > winWord.length()) {
			winWord = word1;
		}
		
	
		while (!winWord.equalsIgnoreCase("STOP")) {

			System.out.print("Enter next string: ");
			String word2 = input.nextLine();

			if (word2.length() > winWord.length()) {
				winWord = word2;
			}
			if (word2.equalsIgnoreCase("STOP")) {
				System.out.println("\n" + "\'" + winWord + "\'");
				break;
			}
		}
		input.close();

		}
	
	}

