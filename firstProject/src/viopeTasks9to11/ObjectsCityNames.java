package viopeTasks9to11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ObjectsCityNames {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		System.out.print("Enter city name: ");
		String city = input.nextLine();

		while (!city.equalsIgnoreCase("quit")) {
			list.add(city);
			System.out.print("Enter city name: ");
			city = input.nextLine();
		}
		input.close();
		
		Collections.sort(list);
		System.out.println();
		for(String cities : list) {
			System.out.println(cities.toUpperCase());
			
		}

	}

}
