package sorting.matrix_sort;

public class Reverse_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		recur(arr, 0, arr.length - 1);
		printArr(arr);

	}

	public static int[] recur(int[] arr, int i, int j) {
//		for(int i = 0, j = arr.length-1; i < j; i++, j--) {
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}

		if (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			recur(arr, ++i, --j);
		}
		return arr;
	}
	
	public static void printArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
