package viopeTasks;

import java.util.Scanner;

public class PrintNumbers_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the middle number: ");
		int num = Integer.parseInt(input.nextLine());
		
		input.close();
		
		String output1 = "";
		for (int i = 1; i < num; i++) {
			output1 += i + " ";
		}

		String output2 = "";
		for (int i = num; i >= 1; i--) {
				output2 += i + " ";
		}
		
		String finalOutput = output1 + output2;
		
		System.out.print(finalOutput);
		
	}

}
