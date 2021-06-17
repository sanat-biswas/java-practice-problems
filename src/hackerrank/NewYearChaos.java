package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewYearChaos {

	public static void minimumBribes(List<Integer> q) {
		for (int i = 0; i < q.size(); i++) {
			if (q.get(i) - (i + 1) > 2) {
				System.out.println("Too Chaotic");
				return;
			}
		}

		int count = 0;
		for (int i = 0; i < q.size(); i++) {
			for (int j = i + 1; j < q.size(); j++) {
				if (q.get(i) > q.get(j)) {
					int temp = q.get(j);
					q.set(j, i);
					q.set(i, temp);

					count++;
				}
			}
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		minimumBribes(arr);
		scan.close();

	}

}
