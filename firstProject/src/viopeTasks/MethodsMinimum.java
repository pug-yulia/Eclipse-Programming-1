package viopeTasks;

import java.util.Scanner;

public class MethodsMinimum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int int1 = Integer.parseInt(input.nextLine());
		System.out.print("Enter second integer: ");
		int int2 = Integer.parseInt(input.nextLine());
		System.out.print("Enter third integer: ");
		int int3 = Integer.parseInt(input.nextLine());
		
		input.close();
		System.out.println();
		
		int answer = minimum(int1, int2, int3);	
		System.out.println("The minimum value is " + answer);
	}
	
	private static int minimum(int int1, int int2, int int3) {
		return Math.min(int1, Math.min(int2, int3));
		
	}

}
