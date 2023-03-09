package viopeTasks5to8;

public class ArraysMatrix {

	public static void main(String[] args) {
			 int[][] m1 = { {1, 2, 0}, {2, 3, 4} };
			 int[][] m2 = { {3, 2, 5}, {6, 4, 3} };
			 int[][] m3 = { {1, 1, 1, 1}, {3, 2, 3, 1}, {2, 2, 2, 2} };
			 int[][] m4 = { {2, 2, 3, 3}, {2, 3, 1, 0}, {1, 2, 3, 4} };
			 printMatrixSum(m1, m2);
			 System.out.println();
			 printMatrixSum(m3, m4);
			

	}

	private static void printMatrixSum(int[][] mx1, int[][]mx2) {
//		System.out.println((mx1[0][0] + mx2[0][0]) + " " + (mx1[0][1] + mx2[0][1]) + " " + (mx1[0][2] + mx2[0][2]) + "\n" 
//				+ (mx1[1][0] + mx2[1][0]) + " " + (mx1[1][1] + mx2[1][1]) + " " + (mx1[1][2] + mx2[1][2]));	
////		
		for (int i = 0; i < mx1.length; i++) {
			for (int j = 0; j < mx1[i].length; j++) {				
				System.out.print((mx1[i][j] + mx2[i][j]) + " ");
			}
			System.out.print("\n");
		}
		
	}
//I DONT KNOW WHAT IM DOIN
}
