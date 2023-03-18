package viopeTasks9to11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import viopeTasks5to8.WordPair;

public class ObjectsSortWordPairs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		List<WordPair> list = new ArrayList<WordPair>();

		System.out.print("Enter an English word (quit ends) : ");
		String engWord = input.nextLine();

		while (!engWord.equalsIgnoreCase("quit")) {

			System.out.print("Enter a Finnish word: ");
			String finWord = input.nextLine();
			list.add(new WordPair(engWord, finWord));
			System.out.println();
			System.out.print("Enter an English word (quit ends) : ");
			engWord = input.nextLine();

		}

		/// Collections.sort(list, (w1, w2) ->
		/// w1.getEnglishWord().compareTo(w2.getEnglishWord())); //lambda
		Collections.sort(list, new Comparator<WordPair>() {
			public int compare(WordPair w1, WordPair w2) {
				return w1.getEnglishWord().compareTo(w2.getEnglishWord());
			}
		});

		System.out.println();
		for (WordPair pair : list) {
			System.out.println(pair.getEnglishWord() + " = " + pair.getFinnishWord());
		}

		// Collections.sort(list, (w1, w2) ->
		// w1.getFinnishWord().compareTo(w2.getFinnishWord())); //lambda
		Collections.sort(list, new Comparator<WordPair>() {
			public int compare(WordPair w1, WordPair w2) {
				return w1.getFinnishWord().compareTo(w2.getFinnishWord());
			}
		});

		System.out.println();
		for (WordPair pair : list) {
			System.out.println(pair.getFinnishWord() + " = " + pair.getEnglishWord());
		}
	}

}
