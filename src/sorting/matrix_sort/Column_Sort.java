package sorting.matrix_sort;

import java.util.Scanner;

public class Column_Sort {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];

		System.out.println("Array:");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = s.nextInt();

		matrix_col_sort(arr);
		printArray(arr);
		sort_matrix(arr);
		printArray(arr);

		s.close();

	}
	
	//sort column wise
	public static void matrix_col_sort(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = i + 1; k < arr[i].length; k++) {
					if (arr[i][j] > arr[k][j]) {
						int temp = arr[i][j];
						arr[i][j] = arr[k][j];
						arr[k][j] = temp;
					}
				}
			}
		}
	}

	//sort row-wise
	public static void sort_matrix(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i].length - 1 - j; k++) {

					if (arr[i][k] > arr[i][k + 1]) {
						int temp = arr[i][k];
						arr[i][k] = arr[i][k + 1];
						arr[i][k + 1] = temp;
					}
				}
			}
		}
	}

	public static void printArray(int[][] arr) {
		System.out.println("Sorted Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
