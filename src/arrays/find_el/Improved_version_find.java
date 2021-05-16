package arrays.find_el;

import java.util.Scanner;

public class Improved_version_find {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] arr = new int[r][c];

		System.out.println("Array: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		System.out.println("Enter the element to be searched: ");
		int n = s.nextInt();

		find_improved(arr, n, r, c);
		System.out.println();

		s.close();
	}

	public static void find_improved(int[][] arr, int target, int n, int m) {

		boolean found = false;
		int r = 0, c = n - 1;
		while (r < m && c >= 0) {
			if (arr[r][c] == target) {
				found = true;
			}
			if (arr[r][c] > target) {
				c--;
			} else {
				r++;
			}
		}

		if (found) {
			System.out.println(target + " Found");
		} else {
			System.out.println(target + " not found");
		}
	}

}
