package viopeTasks;

import java.util.Scanner;

public class MethodsRange {

	public static void main(String[] args) {
		
		//Enter first value: 101
		//Enter last value: 109
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		int value1 = Integer.parseInt(input.nextLine());
		System.out.print("Enter last value: ");
		int value2 = Integer.parseInt(input.nextLine());
		System.out.println();
		input.close();
		
		printRange(value1, value2);
		
	}
	private static void printRange(int value1, int value2) {
		int min = value1;
		int max = value2;
		for (int i =  min; i <= max; i++) {
			System.out.print(i + " ");
		}
		
	}
}
