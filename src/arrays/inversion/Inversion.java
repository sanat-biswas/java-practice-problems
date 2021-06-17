package arrays.inversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inversion {

	public static long inversion(List<Integer> arr) {
		long count = 0;
		System.out.println("Number of inversions: ");
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) > arr.get(j) && i < j) {
					System.out.println(arr.get(i) + " " + arr.get(j));
					count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(s.nextInt());
		}

		System.out.println(inversion(arr));

		s.close();
	}
}
