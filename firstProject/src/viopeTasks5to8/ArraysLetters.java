package viopeTasks5to8;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat Decimal = new DecimalFormat("0.0");

		
		System.out.print("Enter letter: ");
		String letter = input.nextLine();
		input.close();
		String[] array = {"A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"};
		
		double counter = 0;    
		double output = 0;
			
		for (int i = 0; i < array.length; i++) {
		        
			if (letter.equals(array[i])) {
		            counter++;
		   }
		} 
		
		if (counter > 0) {
			double result = (counter / array.length) * 100;
			output = result;
 
		}    
		
		System.out.println(Decimal.format(output) + " %");   

	}

}
