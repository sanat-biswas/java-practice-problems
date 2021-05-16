package arrays.insert_zeroes;

public class Insert_Zeroes {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 0, 2, 3, 0, 4, 5, 6};
		int n = arr.length;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				int j;
				for(j = n-2; j >= i+1; j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = 0;
				i++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");	
		}
	}

}
