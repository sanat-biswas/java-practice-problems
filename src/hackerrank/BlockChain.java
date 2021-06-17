package hackerrank;

import java.util.Scanner;

public class BlockChain {

	public static void blockChain(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[0][j] < arr[i + 1][0]) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		
		blockChain(arr);
		scan.close();

	}

}
