package viopeTasks;

import java.util.Scanner;

public class PrintShape {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter width: ");
		int width = Integer.parseInt(input.nextLine());

		System.out.print("Enter height: ");
		int height = Integer.parseInt(input.nextLine());

		input.close();

		System.out.println();

		int count = 1;
		while (count <= height) {

			for (int i = 1; i <= width; i++) {
				System.out.print("*");

				if (i == width) {
					System.out.print("\n");
				}
			}
			count++;
		}

	}

}
