package arrays.binary_search;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int item;
		int[] arr = new int[] {6, 9, 15, 23, 29, 32, 36, 41, 47, 53, 62, 66, 72, 75, 82, 89, 90, 93, 96};
		
		System.out.println("Enter the item to be searched:");
		item = s.nextInt();
		int n = arr.length;
		int index = binary(arr, n, item);
		if(index == -1) {
			System.out.println("not Found");
		}else {
			System.out.println("found");
		}
		
		System.out.println("First Occ: " + arr[0]);
		System.out.println("Last occ: " + arr[n-1]);
	}
	
	public static int binary(int[] arr, int n, int item) {
		int low = 0, up = n - 1, mid;
		while(low <= up) {
			 mid = (low + up) /2;
			if(item > arr[mid])
				low = mid + 1;
			else if(item < arr[mid])
				up = mid - 1;
			else 
				return mid;
		}
		return -1;
	}

}
