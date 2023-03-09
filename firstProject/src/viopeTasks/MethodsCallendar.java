package viopeTasks;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodsCallendar {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Input year and month number from the user
		System.out.print("Enter year: ");
		int year = Integer.parseInt(input.nextLine());
		System.out.print("Enter month: ");
		int month = Integer.parseInt(input.nextLine());

		System.out.println();
		// Call the method
		printCalendar(month, year);

		input.close();
	}

	public static void printCalendar(int month, int year) {

		String[] months = { "Tammikuu", "Helmikuu", "Maaliskuu", "Huhtikuu", "Toukokuu", "Kesäkuu", "Heinäkuu",
				"Elokuu", "Syyskuu", "Lokakuu", "Marraskuu", "Joulukuu" };
		// set the calendar size by using two dimensional array
		int[][] days = new int[6][7];

		// got some help with that tbh
		// LocalDate.of(year, month, 1) creates a LocalDate object for the first day of
		// the given month and year
		LocalDate myDate = LocalDate.of(year, month, 1);
		// myDate.lengthOfMonth() returns the number of days in the month of myDate
		int daysInMonth = myDate.lengthOfMonth();
		// returns the day of the week for the first day of the month,
		// where 1 represents Monday, 2 represents Tuesday, and so on
		int dayOfWeek = myDate.getDayOfWeek().getValue();

		// Initialize the days array with zeros since we haven't yet determined which
		// days to print
		for (int i = 0; i < days.length; i++) {
			for (int j = 0; j < days[i].length; j++) {
				days[i][j] = 0;
			}
		}

		// Fill in the days array with day numbers
		int row = 0;
		int col = dayOfWeek - 1;
		for (int day = 1; day <= daysInMonth; day++) {
			days[row][col] = day;
			col++;
			if (col == days[row].length) {
				row++;
				col = 0;
			}
		}

		// Print the calendar header
		System.out.println(" > " + months[month - 1] + " " + year + " <");
		System.out.println(" Ma Ti Ke To Pe La Su");

		// Print the day numbers
		for (int i = 0; i < days.length; i++) {
			System.out.print(" ");
			for (int j = 0; j < days[i].length; j++) {
				if (days[i][j] > 0) {
					System.out.print(String.format("%2d", days[i][j]));
					// So %d means decimal, like %s string,
					// but %d then comma then argument replaces the %d with that argument
					// %2d means two digit format, this is a shorter way than importing a decimal
					// format
					//
					// alternatively, if you don't need to format a string you can write
					// int x = 42;
					// System.out.printf( "%d", x);
				} else {
					System.out.print("  ");
				}
				if (days[i][j] == daysInMonth) {
					return;
				}
				if (j < (days[i].length - 1)) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
