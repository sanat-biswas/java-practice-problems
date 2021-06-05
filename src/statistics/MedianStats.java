package statistics;

import java.util.Arrays;
import java.util.Scanner;

public class MedianStats {

	public static void mean(int[] arr) {
		int n = arr.length;

		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		double mean = sum / n;

		System.out.println(String.format("%.1f", mean));
	}

	public static void median(int[] arr) {

		Arrays.sort(arr);
		int mid = (arr.length) / 2;
		double median = ((double) arr[mid] + (double) arr[mid - 1]) / 2;
		System.out.println(String.format("%.1f", median));
	}

	public static void mode(int[] arr) {
		int count = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println("Frequent Element: " + arr[i]);
				count++;
				break;
			}
		}

		System.out.println("Count: " + count);

		if (count == 1) {
			System.out.println(arr[0]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		mean(arr);
		median(arr);
		mode(arr);
		
		sc.close();
	}

}
