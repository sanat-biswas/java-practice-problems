package matrix_row_reverse;

import java.util.Scanner;

public class Matrix_Row_Reverse {

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

		reverseRow(arr);
//		printArr(arr);
//		reverseCol(arr);
		printArr(arr);

	}

	public static void reverseCol(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
			}
		}
	}

	public static void reverseRow(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, k = arr.length - 1; j < k; j++, k--) {
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
			}
		}
	}

	public static void printArr(int[][] arr) {
		System.out.println("Reverse: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
