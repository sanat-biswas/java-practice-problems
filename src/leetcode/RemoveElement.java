package leetcode;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be deleted");
		int n = scan.nextInt();
		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {

				arr[i] = arr[i + 1];

				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
		scan.close();

	}

}
