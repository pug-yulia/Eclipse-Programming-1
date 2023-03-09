package viopeTasks9to11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import viopeTasks5to8.WordPair;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		List<WordPair> list = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		System.out.print("Enter an English word: ");
		String engWord = input.nextLine();
		

		while (!engWord.equalsIgnoreCase("ok")) {
			
			System.out.print("Enter a Finnish word: ");
			String finWord = input.nextLine();
			list.add(new WordPair(engWord, finWord));
			System.out.println();
			System.out.print("Enter an English word: ");
			engWord = input.nextLine();
			
		}

		System.out.println();
		System.out.println("=== English-Finnish translation service (quit ends) ===");
		System.out.print("Enter an English word: ");
		engWord = input.nextLine();
		

		while (!engWord.equalsIgnoreCase("quit")) {

            boolean wordFound = false;
            for (int i = 0; i < list.size(); i++) {
                if (engWord.equalsIgnoreCase(list.get(i).getEnglishWord())) {
                    System.out.println(list.get(i).getFinnishWord());
                    wordFound = true;
                    break;
                }
            }
            if (!wordFound) {
                System.out.println("Unknown word");
            }
            System.out.println();
            System.out.print("Enter an English word: ");
            engWord = input.nextLine();

        }
		
		input.close();
		System.out.print("Bye!");
		
	}

}
