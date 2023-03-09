package viopeTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// get n
		System.out.print("Enter the number of city names: ");
		int n = Integer.parseInt(input.nextLine());

		String[] array = new String[n];

		// fill array
		for (int i = 0; i < n; i++) {
			System.out.print("Enter city name: ");
			String city = input.nextLine();
			array[i] = city;

		}
		
		input.close();
		Arrays.sort(array);
		
		//if word = previous word => next word, if word != previous word => its a distinct word => print
		String output = "";
		for (int i = 1; i < array.length; i++) {
			if (!array[i].equalsIgnoreCase(array[i-1])) {
				output += array[i] + " ";
			}
		}
		System.out.println( array[0] + " " + output);
		
		
	}

}
