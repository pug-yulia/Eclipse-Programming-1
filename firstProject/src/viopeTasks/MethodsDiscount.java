package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Enter list price: 120,00
		//Enter selling price: 75,00

		//The discount percentage is 37,50 %
		Scanner input = new Scanner(System.in);
		DecimalFormat twoDecimals = new DecimalFormat("0.00");

		System.out.print("Enter list price: ");
		double list = Double.parseDouble(input.nextLine().replace(',', '.'));
		System.out.print("Enter selling price: ");
		double sell = Double.parseDouble(input.nextLine().replace(',', '.'));
		input.close();
		
		System.out.println();

		System.out.println("The discount percentage is " + twoDecimals.format(computePercentage(list, sell)) + " %");
	}
	
	private static double computePercentage(double list, double sell) {
		
		double discount = 100 - (sell * 100 / list);
		return discount;
		
	}

}
