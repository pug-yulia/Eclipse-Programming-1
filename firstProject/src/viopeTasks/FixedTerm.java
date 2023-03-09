package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FixedTerm {

	public static void main(String[] args) {

		// Enter initial deposit: 1000,00
		// Enter time period in full years: 3
		// Enter interest rate (%): 10,0
		// Enter capital income tax rate (%): 20,0

		// Year 1: 100,00 | 1100,00
		// Year 2: 210,00 | 1210,00
		// Year 3: 331,00 | 1331,00

		// The interest after tax is 264,80
		// The remaining balance after tax is 1264,80

		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter initial deposit: ");
		double deposit = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter time period in full years: ");
		int years = Integer.parseInt(input.nextLine());
		System.out.print("Enter interest rate (%): ");
		double interestRate = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter capital income tax rate (%): ");
		double tax = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.println();
		input.close();

		double interest = 0;
		double balance = deposit;
		
		for (int i = 1; i <= years; i++) {

			interest = balance * (interestRate / 100) + interest;
			balance = deposit + interest;
			System.out.println(
					"Year " + i + ": " + twoDecimals.format(interest) + " | " + twoDecimals.format(balance));
		}
		
		System.out.println();
		double interestAfterTax = interest - (tax / 100 * interest); 
		double remainingBalance = deposit + interestAfterTax;
		
		System.out.println("The interest after tax is " + twoDecimals.format(interestAfterTax));
		System.out.println("The remaining balance after tax is " + twoDecimals.format(remainingBalance));

	}

}
