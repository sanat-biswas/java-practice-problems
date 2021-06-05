package leetcode;

public class SearchInsert {

	public static int searchInsert(int[] arr, int val) {
		int low = 0;
		int high = arr.length - 1;
		int mid = (low + high) / 2;

		while (low <= high) {
			if (val == arr[mid])
				return mid;
			else if (val < arr[mid - 1])
				high = mid - 1;
			else 
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 3, 5, 6 };
		System.out.println(searchInsert(arr,8));

	}

}
