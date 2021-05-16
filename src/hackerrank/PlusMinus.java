package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

	public static void plusMinus(List<Integer> arr) {
		int size = arr.size();
		int pos = 0, neg = 0, zero = 0;
		for (int i : arr) {
			if (i == 0) {
				++zero;
			} else if (i < 0) {
				++neg;
			} else if (i > 0) {
				++pos;
			}
		}

		System.out.println(String.format("%.6f", (float) pos / size));
		System.out.println(String.format("%.6f", (float) neg / size));
		System.out.println(String.format("%.6f", (float) zero / size));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(0);
		list.add(-1);
		list.add(-1);

		plusMinus(list);

	}

}
