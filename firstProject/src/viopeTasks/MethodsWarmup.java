package viopeTasks;

public class MethodsWarmup {

	public static void main(String[] args) {
		printNumbers();

	}

	private static String printNumbers() {

		String part1 = "";
		for (int i = 2; i <= 50; i = i + 2) {
			part1 += i + " ";
		}
		
		String part2 = "";
		for (int i = 49; i >= 1; i = i - 2) {
			part1 += i + " ";
		}
		
		String output = part1 + part2;
		System.out.print(output);
		return output;
	}

}
