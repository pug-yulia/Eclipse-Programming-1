package viopeTasks;

import java.util.Scanner;

public class SalesProgram {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter price: ");

		int price = Integer.parseInt(input.nextLine());

		System.out.print("Enter product name: ");

		String name = input.nextLine();

		System.out.print("Enter discount: ");

		int discount = Integer.parseInt(input.nextLine());

		System.out.println('\n' + "The selling price of a " + name + " is " + (price - discount) + " euros.");

		input.close();
	}

}
