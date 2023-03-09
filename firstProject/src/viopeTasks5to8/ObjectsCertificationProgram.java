package viopeTasks5to8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		Coach[] array = new Coach[4];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter coach name: ");
			String name = input.nextLine();
			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());
			
			Coach Coach = new Coach(name, score);
			array[i] = Coach; 

		}
		
		System.out.println();
		System.out.print("Enter the minimum passing score: ");
		int passingScore = input.nextInt();
		input.close();
		
		
		System.out.println();
		System.out.println("Passing scores");
		
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].getScore() >= passingScore) {
				System.out.println(array[i].getName() + " (" + array[i].getScore() + " points)");
				count++;
			}
		}
		
		double passingRate = ((double)count / array.length) * 100;
		System.out.println("The passing rate is " + oneDecimal.format(passingRate).replace(',', '.') + " %");
		
		

	}

}
