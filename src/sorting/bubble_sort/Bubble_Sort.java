package sorting.bubble_sort;

public class Bubble_Sort {

	public static void main(String[] args) {
	
		int[] arr = new int[] {30, 10, 20, 60, 50, 40};
		int cnt = 0;
		
		int n = arr.length;
		System.out.println("Unsorted Array: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					cnt++;
				}
				
			}
		}
		
		System.out.println("Sorted Array: ");

		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Total swaps: " + cnt);
	}

}
