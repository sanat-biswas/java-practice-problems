package statistics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class InterquartileRange {

	public static void interQuartile(List<Integer> values, List<Integer> freq) {

		int s = 0;
		for (int i = 0; i < freq.size(); i++) {
			s += freq.get(i);
		}

		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < values.size(); i++) {
			for (int j = 0; j < freq.get(i); j++) {
				arr.add(values.get(i));
			}
		}

		Collections.sort(arr);

		int median = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.size() % 2 == 0) {
				int mid = arr.size() / 2;
				median = (arr.get(mid - 1) + arr.get(mid)) / 2;
			} else {
				int mid = arr.size() / 2;
				median = arr.get(mid);
			}
		}

		List<Integer> leftArr = new ArrayList<>();
		List<Integer> rightArr = new ArrayList<>();
		int lcount = 0;
		int rcount = 0;
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) <= median) {
				leftArr.add(arr.get(i));
				lcount++;
			} else if (arr.get(i) > median) {
				rightArr.add(arr.get(i));
				rcount++;
			}
		}

		double leftMedian = 0;
		double rightMedian = 0;

		int leftMid = 0;
		int rightMid = 0;

		if (leftArr.size() % 2 == 0) {
			leftMid = leftArr.size() / 2;
			leftMedian = ((leftArr.get(leftMid - 1) + (leftArr.get(leftMid)))) / 2;
		} else {
			leftMid = leftArr.size() / 2;
			leftMedian = leftArr.get(leftMid);
		}

		if (rightArr.size() % 2 == 0) {
			rightMid = rightArr.size() / 2;
			rightMedian = ((rightArr.get(rightMid - 1) + (rightArr.get(rightMid)))) / 2;
		} else {
			rightMid = rightArr.size() / 2;
			rightMedian = rightArr.get(rightMid);
		}

		System.out.println(String.format("%.1f", (rightMedian - leftMedian)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> values = new ArrayList<>();
		List<Integer> freq = new ArrayList<>();
//		values.add(6);
//		values.add(12);
//		values.add(8);
//		values.add(10);
//		values.add(20);
//		values.add(16);

		for (int i = 0; i < n; i++) {
			values.add(sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			freq.add(sc.nextInt());
		}
//		freq.add(5);
//		freq.add(4);
//		freq.add(3);
//		freq.add(2);
//		freq.add(1);
//		freq.add(5);

		interQuartile(values, freq);

		sc.close();
	}

}
