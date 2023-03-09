package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MealProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Enter the price of food: ");
		double price = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the tax rate: ");
		double tax = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.print("Enter the tip percentage: ");
		double tip = Double.parseDouble(input.nextLine().replace(',', '.'));

		double total = price + (price * tax / 100) + (price * tip / 100);
		System.out.println("\n" + "The total cost is " + twoDecimal.format(total));

		input.close();
	}

}
