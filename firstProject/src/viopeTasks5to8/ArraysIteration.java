package viopeTasks5to8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraysIteration {

	public static void main(String[] args) {
	
		//Enter an integer: 3
		//Enter an integer: 9
		//Enter an integer: 1
		//Enter an integer: 4
		//Enter an integer: 7

		//9 7 4 3 1 
		Scanner input = new Scanner(System.in);
		
		Integer [] array = new Integer[5];
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("Enter an integer: ");
			int integer = input.nextInt();
			array[i] = integer;
			
			
		}
		
		Arrays.sort(array, Collections.reverseOrder());
		printArray(array);
		
		input.close();
	}
	
	
	private static void printArray(Integer[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		for (int i =   0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		}
	}
	
}
