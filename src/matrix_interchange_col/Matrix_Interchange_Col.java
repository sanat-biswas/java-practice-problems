package matrix_interchange_col;

import java.util.Scanner;

public class Matrix_Interchange_Col {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Array: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		interchange_col(arr);
		printArr(arr);

	}

	public static void interchange_col(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i][0];
			arr[i][0] = arr[i][arr.length - 1];
			arr[i][arr.length - 1] = temp;

		}
	}

	public static void printArr(int[][] arr) {
		System.out.println("Interchange: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

		}
	}

}
