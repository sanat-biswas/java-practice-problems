package magic_matrix;

import java.util.Scanner;

public class Magic_Matrix {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the odd number :");
		int n = s.nextInt();

		int[][] arr = new int[n][n];

		magic_matrix(arr, n);
		
		s.close();

	}

	public static void magic_matrix(int[][] arr, int n) {
		int i = n - 1; // bottom row
		int j = (n - 1) / 2; // center row

		for (int num = 1; num <= n * n; num++) {
			arr[i][j] = num;

			i++; // move left
			j--; // move down

			if (num % n == 0) {
				i -= 2; // one above the previous one
				j++; // back to the previous position
			}

			else if (i == n)
				i = 0; // go to the topmost row
			else if (j == -1)
				j = n - 1; // go to the rightmost column

		}

		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				System.out.print(arr[k][l] + " ");
			}
			System.out.println();
		}
	}

}
