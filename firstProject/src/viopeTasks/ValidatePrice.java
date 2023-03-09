package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValidatePrice {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		try {
			System.out.print("Enter the price before VAT: ");
			String price = input.nextLine();
			double priceDouble = Double.parseDouble(price.replace(',', '.'));
			double total = priceDouble + (priceDouble * 0.25);
			
			System.out.println("\n" + "The VAT inclusive price is " + twoDecimals.format(total));

		} catch (NumberFormatException nfe) {
			System.out.println("\n" + "Invalid price!");
		}
		
		input.close();
	}

}
