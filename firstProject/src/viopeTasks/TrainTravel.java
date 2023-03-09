package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TrainTravel {

	public static void main(String[] args) {
		// Enter the number of train trips: 3
		// Enter the single ticket price: 20,50
		// Enter the monthly season ticket price: 80,00

		// Buying single tickets is 18,50 euros cheaper.

		Scanner input = new Scanner(System.in);
		
		DecimalFormat twoDecimal = new DecimalFormat("0.00");

		System.out.print("Enter the number of train trips: ");
		int trips = Integer.parseInt(input.nextLine());

		System.out.print("Enter the single ticket price: ");
		double priceSingle = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter the monthly season ticket price: ");
		double priceMonthly = Double.parseDouble(input.nextLine().replace(',', '.'));

		input.close();
		
		double singleTotal = trips * priceSingle;
		
		if (singleTotal > priceMonthly) {
			double diff = singleTotal - priceMonthly;
			System.out.println("\n" + "Buying a monthly season ticket is " + twoDecimal.format(diff) + " euros cheaper.");
		}
		else if (singleTotal < priceMonthly){
			double diff = priceMonthly - singleTotal;
			System.out.println("\n" + "Buying single tickets is " + twoDecimal.format(diff) + " euros cheaper.");
		}
		else {
			System.out.println("\n" + "The total cost is the same.");
		}

	}

}
