package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BeachVolleyball {

	public static void main(String[] args) {
		// Enter the number of people: 5
		// Enter the hourly rate: 20,50
		// Enter the length of the rental (hours): 3

		// Each of the 5 people should pay 12,30 euro.
		
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter the number of people: ");
		int people = Integer.parseInt(input.nextLine());
		
		System.out.print("Enter the hourly rate: ");
		double rate = Double.parseDouble(input.nextLine().replace(',', '.'));
		
		System.out.print("Enter the length of the rental (hours): ");
		int rental = Integer.parseInt(input.nextLine());
		
		input.close();
		
		double toPay = (rental * rate)/ people;
		
		System.out.println("\n" + "Each of the " + people + " people should pay " + twoDecimals.format(toPay) + " euros.");
		
	}

}
