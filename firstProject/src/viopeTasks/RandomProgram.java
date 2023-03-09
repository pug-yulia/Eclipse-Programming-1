package viopeTasks;

import java.util.Random;
import java.util.Scanner;

public class RandomProgram {

	static Random randomizer = new Random(); // Do NOT change this line of code!

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = randomizer.nextInt(100); // Do NOT change this line of code!
		// Write your own code below ...
		
		System.out.print("Guess a number (0-99): ");
		int guess = Integer.parseInt(input.nextLine());
		
		while (true) {
			
			if (guess > number) {
				System.out.print("The correct number is smaller!"); 
				System.out.println();
				System.out.print("\n" + "Guess again: ");
				guess = input.nextInt();	
			} else if (guess < number) {
				System.out.print("The correct number is larger!");
				System.out.println();
				System.out.print("\n" + "Guess again: ");
				guess = input.nextInt();	
			} else if (guess == number){
				System.out.println("Correct!");
				input.close();
				break;
			} else {
				guess = input.nextInt();	
			}
		}

	}

}
