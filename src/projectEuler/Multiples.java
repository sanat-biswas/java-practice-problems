package projectEuler;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int a = 0; a < t; a++) {
			int n = s.nextInt();
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					System.out.println(i);
					sum += i;

				}
			}
			System.out.println(sum);
		}


		s.close();
	}

}
