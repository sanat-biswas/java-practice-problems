package leetcode;

public class RemoveDuplicates {

	public static int removeDuplicate(int[] arr, int val) {

		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j] = arr[i];
				j++;
			}
		}

		temp[j++] = arr[n - 1];
		
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}

	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
		
		int n = removeDuplicate(arr, arr.length);
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
}
