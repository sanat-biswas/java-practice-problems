package arrays.find_el;

import java.util.Scanner;

public class Find_Matrix_El {

	public static int rows = 3;
	public static int cols = 3;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[][] arr = new int[rows][cols];

		System.out.println("Array: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		System.out.println("Enter the element to be searched: ");
		int n = s.nextInt();
		
		System.out.println(find(arr, n));

		s.close();

	}
	
	
	public static boolean find(int[][] arr, int n){
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if(arr[i][j] == n)
					return true;
			}
		}
		return false;
	}

}
