package firstProject;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter text: ");

		String text = input.nextLine();

		for (int i = 1; i <= 10; i++) {
			System.out.println(text);
		}
		input.close();
	}

}
