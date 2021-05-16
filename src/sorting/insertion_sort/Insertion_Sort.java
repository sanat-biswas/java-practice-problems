package sorting.insertion_sort;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] arr = new int[] {30, 10, 50, 20, 60, 40};
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			int curr = arr[i], j = i;
			
			while(j > 0 && arr[j-1] > curr) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = curr;
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
