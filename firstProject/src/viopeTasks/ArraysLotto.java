package viopeTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArraysLotto {

	public static void main(String[] args) {
		Random randomGenerator = new Random();

		//use list isntead of array bc it allows more manipulations with it than arrays
		List<Integer> numbersList = new ArrayList<>();
		
		//add numbers 1 to 39 to the list
		for(int i = 1; i <= 39; i++) {
			numbersList.add(i);
		}
		
		//new list for 7 random numbers that are to be printed
		List<Integer> finalList = new ArrayList<>();

		for(int i = 0; i < 7; i++) {
			finalList.add(numbersList.remove(randomGenerator.nextInt(numbersList.size())));
			//quirky line! we add to finalList those 7 random numbers 
			//that we remove from numberList
			
		}
		
		//Lists's alternstive of array's Arrays.sort(array);
		Collections.sort(finalList);
		
		for(int i = 0; i < finalList.size(); i++) {
			System.out.print(finalList.get(i) + "  ");
			//.get() - short method for array Lists
		
		}

		
	}

}

//import java.util.Arrays;
//import java.util.Random;
//
//public class ArraysLotto {
//    public static void main(String[] args) {
//        int[] lottoNumbers = new int[7];
//        Random randomGenerator = new Random(); // create the random number generator
//
//        // generate 7 unique numbers
//        int i = 0;
//        while (i < lottoNumbers.length) {
//            //random number between 1 and 39
//            int randomNumber = randomGenerator.nextInt(39) + 1;
//            boolean isDuplicate = false;
//            // check if the number already exists in the array
//            for (int j = 0; j < i; j++) {
//                if (lottoNumbers[j] == randomNumber) {
//                    isDuplicate = true;
//                    break;
//                    //if duplicate true don't add
//                }
//            }
//            if (isDuplicate == false) {
//                lottoNumbers[i] = randomNumber;
//                i++;
//                //if duplicate false add
//            }
//        }
//
//        Arrays.sort(lottoNumbers); // sort the array in ascending order
//
//        // print the lotto numbers
//        for (int number : lottoNumbers) {
//            System.out.print(number + " ");
//        }
//    }
//}
//
