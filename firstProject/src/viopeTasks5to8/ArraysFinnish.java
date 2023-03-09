package viopeTasks5to8;

import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {

		// "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher"

		Scanner input = new Scanner(System.in);
		String[] arrayEn = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] arrayFi = { "bussi", "auto", "kissa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };

		System.out.print("Enter an English word: ");
		String engWord = input.nextLine();
		input.close();

		String output = "Unknown word";
		for (int i = 0; i < arrayEn.length; i++) {
			if (engWord.equals(arrayEn[i])) {
				output = arrayFi[i];
			}

		}
		System.out.println(output);
	}

}
