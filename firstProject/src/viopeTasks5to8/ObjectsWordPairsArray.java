package viopeTasks5to8;

public class ObjectsWordPairsArray {

	public static void main(String[] args) {

		WordPair[] array = {

				new WordPair("school", "koulu"), 
				new WordPair("student", "opiskelija"),
				new WordPair("textbook", "oppikirja") 
				};

		for (WordPair WordPair : array) {
			System.out.println(WordPair.getEnglishWord() + " = " + WordPair.getFinnishWord());
		}
	}

}
