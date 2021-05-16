package arrays.reverse;

import java.util.Scanner;

public class ArrayReverse {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = s.nextInt();
		int[] b = new int[n];
		
		int j = n;
		for(int i = 0; i < a.length; i++) {
			b[j-1] = a[i];
			j = j - 1;
		}
		
		for(int i = 0; i < a.length; i++)
			System.out.print(b[i] + " ");
	}
}
