package viopeTasks;

import java.text.DecimalFormat;

import java.util.Scanner;

public class DecimalProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a decimal number: ");
		double number1 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter a decimal number: ");
		double number2 = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		DecimalFormat twoDecimal = new DecimalFormat("0.00");
		DecimalFormat sixDecimals = new DecimalFormat("0.000000");
				
		System.out.println("\n" +  twoDecimal.format(number1) + " * " + twoDecimal.format(number2) + " = " + twoDecimal.format((number1 * number2)));
				
		System.out.println(twoDecimal.format(number1) + " * " + twoDecimal.format(number2) + " = " + sixDecimals.format((number1 * number2)));

		input.close(); 
	}

}
