package viopeTasks5to8;

import java.util.Arrays;

public class ArraysLibrary {

	public static int max(Integer[] array) {
		Integer[] arr = Arrays.copyOf(array, array.length);
		Arrays.sort(arr);
		return arr[arr.length - 1];

	}

	public static int min(Integer[] array) {
		Integer[] arr = Arrays.copyOf(array, array.length);
		Arrays.sort(arr);
		return arr[0];

	}

	public static double median(Integer[] array) {
		Integer[] arr = Arrays.copyOf(array, array.length);
		Arrays.sort(arr);
		int middle = arr.length / 2;

		if (arr.length % 2 == 0) {
			return (double) (arr[middle - 1] + arr[middle]) / 2;
		} else {
			return arr[middle];
		}
	}

	public static double mean(Integer[] array) {

		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return (double) sum / array.length;
	}

	public static double standardDeviation(Integer[] array) {
		
		double mean = mean(array);
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			double diff = array[i] - mean;
			sum += diff * diff;
		}
		return Math.sqrt(sum / (array.length - 1));
	}
}
