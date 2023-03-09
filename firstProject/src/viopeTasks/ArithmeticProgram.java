package viopeTasks;

import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");

		int integer = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter another integer: ");

		int anotherInteger = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter a decimal number: ");

		double number = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.println("\n" + integer + " * " + anotherInteger + " = " + (integer * anotherInteger));
				
		System.out.println(integer + " * " + number + " = " + (integer * number));
				
		System.out.println(number + " * " + number + " = " + (number * number));
		
		input.close(); 
	}

}
