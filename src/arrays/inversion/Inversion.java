package arrays.inversion;

import java.util.Scanner;

public class Inversion {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[] {4, 9, 2, 8, 7};
		int count = 0;
		System.out.println("Number of inversions: ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j] && i < j) {
				
					System.out.print("(" + arr[i] + ", " + arr[j] +")" + " ");
					count++;
				}
			}
		}
		
		System.out.println();
		System.out.print("Number of inversions: " + count);
		
		s.close();
	}
}
