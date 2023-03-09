package viopeTasks;

import java.math.BigDecimal;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiplicationProgram {

	public static void main(String[] args) {
		// Enter x: 0.1
		// Enter y: 2.2

		// 0.1 * 2.2 = 0.22
		
		Scanner input = new Scanner(System.in);
		//DecimalFormat twoDecimals = new DecimalFormat("0.00");
		
		System.out.print("Enter x: ");
		String xAsText = input.nextLine().replace(',', '.');
		BigDecimal x = new BigDecimal(xAsText);


		System.out.print("Enter y: ");
		String yAsText = input.nextLine().replace(',', '.');
		BigDecimal y = new BigDecimal(yAsText);
		
		input.close();
		
		BigDecimal xy = x.multiply(y);
		
		System.out.println("\n" + x + " * " + y + " = " + xy );

	}

}
