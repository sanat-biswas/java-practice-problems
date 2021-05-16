package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MiniMaxSum {

	public static void minMaxSum(List<Integer> arr) {

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		int sum = 0;
		for (int j : arr) {
			sum += j;
			if (j < min) {
				min = j;

			}
			if (j > max) {
				max = j;

			}
		}

		System.out.println((sum - max) + " " + (sum - min));

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(9);
		
		minMaxSum(list);
	}
}
