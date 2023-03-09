package firstProject;

import java.util.Scanner;

public class UserInputNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");

		int max = Integer.parseInt(input.nextLine());

		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
		input.close();
	}

}