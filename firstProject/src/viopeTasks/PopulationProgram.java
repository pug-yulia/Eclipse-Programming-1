package viopeTasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		DecimalFormat oneDecimal = new DecimalFormat("0.0");

		System.out.print("Enter the population of the area A: ");

		int AreaA = Integer.parseInt(input.nextLine());

		System.out.print("Enter the population of the area B: ");

		int AreaB = Integer.parseInt(input.nextLine());

		System.out.print("Enter the population of the area C: ");

		int AreaC = Integer.parseInt(input.nextLine());
		
		input.close();

		int total = AreaA + AreaB + AreaC;

		System.out.println(
				"\n" + "A: " + oneDecimal.format(Double.valueOf(AreaA) / total * 100) + " %" + "\n" + "B: " + oneDecimal.format(Double.valueOf(AreaB) / total * 100) + " %" 
		+ "\n" + "C: " + oneDecimal.format(Double.valueOf(AreaC) / total * 100) + " %");

	}

}
