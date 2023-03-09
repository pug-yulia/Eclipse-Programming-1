package viopeTasks5to8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysDeviation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		DecimalFormat twoDecimal = new DecimalFormat("0.0");
		
		//get n
		System.out.print("Enter the number of values: ");
		int n = Integer.parseInt(input.nextLine());
		
		Integer[] array = new Integer[n];
		
		if (n < 4) {
			System.out.println("Sorry, at least 4 values required");
		} else {

			//fill array
			for (int i = 0; i < n; i++) {
				System.out.print("Enter an integer: ");
				int integer = input.nextInt();
				array[i] = integer;
			}
	
			
			System.out.println();
			input.close();
			
				System.out.println("n = " + n);
				System.out.println("Min: " + ArraysLibrary.min(array));
				System.out.println("Max: " + ArraysLibrary.max(array));
				System.out.println("Mean: " + twoDecimal.format(ArraysLibrary.mean(array)));
				System.out.println("Median: " + twoDecimal.format(ArraysLibrary.median(array)));
				System.out.println("Sample standard deviation: " + twoDecimal.format(ArraysLibrary.standardDeviation(array)));
				System.out.print("Sample data: " + listArray(array));
	}
	}
	
	public static String listArray(Integer[] array) {
		
		String output = "";
		for (int i = 0; i < array.length; i++) {
			output += array[i] + " ";
		}
		return output;
		
	}

}