package viopeTasks5to8;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = input.nextLine();
		input.close();

		int letterCount = 0;
		int digitCount = 0;
		int otherCount = 0;
		
		for (int i = 0; i < string.length(); i++) {
			char character = string.charAt(i);
			if (Character.isLetter(character)) {
				letterCount++;
			}else if (Character.isDigit(character)) {
				digitCount++;
			}else {
				otherCount++;
			}
		}

		
		System.out.println(letterCount + " letter(s)");
		System.out.println(digitCount + " digit(s)");
		System.out.println(otherCount+ " other character(s)");

	}

}
