package arrays.left_rotate;

public class Left_rotation {

	public static void rotate(int[] arr, int d, int n) {
		
		int[] temp = new int[d];
		for(int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		
		for(int i = d; i < n; i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i = 0; i < d; i++) {
			arr[i+n-d] = temp[i];
		}
		
		System.out.println("After rotate: ");
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		rotate(arr, 3, arr.length);

	}

}
