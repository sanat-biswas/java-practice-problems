package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Candies {

	public static long candies(int n, List<Integer> arr) {

		int[] c = new int[n];
		Arrays.fill(c, 1);

		for (int i = 1; i < n; i++) {
			if (arr.get(i) > arr.get(i - 1)) {
				c[i] = c[i - 1] + 1;
			}
		}

		for (int i = n - 2; i >= 0; i--) {
			if (arr.get(i) > arr.get(i + 1)) {
				c[i] = Math.max(c[i + 1] + 1, c[i]);
			}
		}

		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + (long) c[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(s.nextInt());
		}

		System.out.println(candies(n, arr));

		s.close();

	}

}
