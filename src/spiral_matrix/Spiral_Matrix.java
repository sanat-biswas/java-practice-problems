package spiral_matrix;

import java.util.Scanner;

public class Spiral_Matrix {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
		print_spiral_matrix(arr, n);
		s.close();

	}

	public static void print_spiral_matrix(int[][] arr, int n) {
		
		for(int start = 0, end = n-1; start <= end; start++, end--) {
			
			for (int i = start; i <= end; i++)
				System.out.print(arr[start][i]+" ");
			for(int i = start+1; i <= end; i++)
				System.out.print(arr[i][end]+" ");
			for(int i = end-1; i >= start; i--)
				System.out.print(arr[end][i]+" ");
			for(int i = end-1; i >= start+1; i--)
				System.out.print(arr[i][start]+" ");
			
			
		}
	}

}
