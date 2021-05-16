package arrays.even_sum;

import java.util.Scanner;

public class Even_Sum_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int sum = 0;

		int[] arr = new int[n];
		System.out.println("Array");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		recur(arr, n - 1, sum);

		s.close();
	}

	public static void recur(int[] arr, int n, int sum) {
		if (n < 0) {
			System.out.println(sum);
			return;
		}

		if (arr[n] % 2 == 0) {
			sum += arr[n];
		}

		recur(arr, n - 1, sum);
	}
}
