package viopeTasks5to8;

import java.util.Scanner;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		//"bird", "bar", "bus", "car", "cat", "dog".
		Scanner input = new Scanner(System.in);
		
		WordPair[] array = {
				new WordPair("bird", "lintu"),
				new WordPair("bar", "baari"),
				new WordPair("bus", "bussi"),
				new WordPair("car", "auto"),
				new WordPair("cat", "kissa"),
				new WordPair("dog", "koira"),			
		};
		
		System.out.print("Enter an English word: ");
		String englishWord = input.nextLine();
		input.close();
		
		
		boolean wordFound = false;
		String translation = "";
		
		
		for (int i = 0; i < array.length; i++) {
            if (englishWord.equals(array[i].getEnglishWord())) {
                wordFound = true;
                translation = array[i].getFinnishWord();
                break;
            }
        }
		
		if (wordFound == true) {
			System.out.println(translation);
		} else {
			System.out.println("Unknown word");
		}

	}

}
