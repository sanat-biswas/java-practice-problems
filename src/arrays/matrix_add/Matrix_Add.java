package arrays.matrix_add;

import java.util.Scanner;

public class Matrix_Add {
	
	public static int rows = 3;
	public static int cols = 3;
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr1 = new int[rows][cols];
		int[][] arr2 = new int[rows][cols];
		
		System.out.println("Array1: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr1[i][j] = s.nextInt();
			}
		}
		
		System.out.println("Array2: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr2[i][j] = s.nextInt();
			}
		}
		System.out.println("resultant matrix: ");
		matrixAdd(arr1, arr2);
		
		s.close();
		
		
	}
	
	public static void matrixAdd(int[][] arr1, int[][] arr2) {
		
		int[][] arr3 = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int i =0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
}
