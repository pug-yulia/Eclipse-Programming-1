package viopeTasks5to8;

import java.util.Scanner;

public class ArraysCandidates {

	public static void main(String[] args) {
//
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter the number of candidates: ");
//		int candidatesNum = Integer.parseInt(input.nextLine());
//
//		String[] names = new String[candidatesNum];
//		int[] votes = new int[candidatesNum];
//
//		// fill array
//		for (int i = 0; i < candidatesNum; i++) {
//			System.out.print("Enter name: ");
//			names[i] = input.nextLine();
//
//			System.out.print("Enter " + names[i] + "'s votes: ");
//			votes[i] = Integer.parseInt(input.nextLine());
//
//		}
//
//		input.close();
//		String winner = "";
//		int mostVotes = 0;
//		int[] indexes = new int[names.length];
//		String output1 = "";
//		int counter = 0;
//
//		// find winner
//		for (int i = 0; i < votes.length; i++) {
//			if (votes[i] > mostVotes) {
//				mostVotes = votes[i];
//				winner = names[i];
//				output1 = "\n" + winner + " is the winner with " + mostVotes + " votes!";
//				
//
//			}
//		}
//
//		// indexes of candidates with equal votes
//		for (int i = 0; i < votes.length; i++) {
//			if (mostVotes == votes[i]) {
//				indexes[i] = votes[i];
//		
//			}
//		}
//
//		// print if tie
//		String list = "";
//		String output2 = "";
//		for (int i = 0; i < indexes.length; i++) {
//			counter ++;
//			list += "\n" + names[i] + " (" + votes[i] + ")";
//			output2 = "\n" + "It is a tie!" + list;
//		}
//
//		// output
//		if (counter > 0) {
//			System.out.println(output2); 
//		} else {
//			System.out.println(output1); 
//		}
//		
//		
//		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of candidates: ");
		int candidatesNum = Integer.parseInt(input.nextLine());

		String[] names = new String[candidatesNum];
		int[] votes = new int[candidatesNum];

		// fill array
		for (int i = 0; i < candidatesNum; i++) {
			System.out.print("Enter name: ");
			names[i] = input.nextLine();

			System.out.print("Enter " + names[i] + "'s votes: ");
			votes[i] = Integer.parseInt(input.nextLine());
		}

		input.close();

		String winner = "";
		int mostVotes = 0;
		String list = "";
		boolean tie = false;

		// find winner and indexes of candidates with equal votes
		for (int i = 0; i < votes.length; i++) {
			if (votes[i] > mostVotes) {
				mostVotes = votes[i];
				winner = names[i];
				list = "\n" + names[i] + " (" + votes[i] + ")";
				tie = false;
			} else if (votes[i] == mostVotes) {
				list += "\n" + names[i] + " (" + votes[i] + ")";
				tie = true;
			}
		}

		// output
		if (tie) {
			System.out.println("\nIt is a tie!" + list);
		} else {
			System.out.println("\n" + winner + " is the winner with " + mostVotes + " votes!");
		}
	}

}
