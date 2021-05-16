package arrays.delete_el;

import java.util.Scanner;

public class Delete_Elements {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] a = new int[] { 1, 2, 3, 4, 5, 6 };

		int el = s.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == el) {
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}

		}

		System.out.println("Array: ");
		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
		
		s.close();
	}

}
