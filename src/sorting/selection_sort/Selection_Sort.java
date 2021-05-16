package sorting.selection_sort;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = new int[] {30, 10, 50, 20, 60, 40};
		
		int n = arr.length, j;
		for(int i = 0; i < n; i++) {
			int min = i;
			
			for(j = i + 1; j < n; j++) {
				if(arr[j] < arr[min]) 
					min = j;
				
			}
			
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
