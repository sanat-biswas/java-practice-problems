package row_col_sum;

import java.util.Scanner;

public class Row_Col_Sum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		System.out.println("Enter Array: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		row_col_sum(arr, n);
		s.close();

	}

	public static void row_col_sum(int[][] arr, int n) {
		int sum_row = 0, sum_col = 0;
		System.out.println("Row Sum:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum_row += arr[i][j];
				sum_col += arr[j][i];

				System.out.print(arr[i][j] + " ");
			}
			System.out.print(sum_row + " ");
			System.out.println();
			System.out.print(sum_col + " " );
			sum_row = 0;
			sum_col = 0;
		}
	}

}
