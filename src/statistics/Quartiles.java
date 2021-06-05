package statistics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quartiles {

	public static List<Integer> quartiles(List<Integer> arr) {

		List<Integer> leftArr = new ArrayList<>();
		List<Integer> rightArr = new ArrayList<>();

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

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < median) {
				leftArr.add(arr.get(i));
			} else if (arr.get(i) > median) {
				rightArr.add(arr.get(i));
			}
		}

		// for left list and right list
		int leftMedian = 0;
		int rightMedian = 0;
		int mid = 0;
		if (leftArr.size() % 2 == 0) {
			mid = leftArr.size() / 2;
			leftMedian = (leftArr.get(mid - 1) + leftArr.get(mid)) / 2;
		}
		else {
			mid = leftArr.size()/ 2;
			leftMedian = leftArr.get(mid);
		}
		if (rightArr.size() % 2 == 0) {
			mid = rightArr.size() / 2;
			rightMedian = (rightArr.get(mid - 1) + rightArr.get(mid)) / 2;
			
		} else {
			mid = rightArr.size() / 2;
			rightMedian = rightArr.get(mid);
		}
		
		System.out.println(leftArr);
		System.out.println(rightArr);
		System.out.println(rightMedian);
		return Arrays.asList(leftMedian, median, rightMedian);
	}

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(7);
		arr.add(8);
		arr.add(5);
		arr.add(12);
		arr.add(14);
		arr.add(21);
		arr.add(15);
		arr.add(18);
		arr.add(14);
		Collections.sort(arr);
		
		System.out.println(quartiles(arr));

	}

}
