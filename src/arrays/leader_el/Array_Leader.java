package arrays.leader_el;

public class Array_Leader {

	public static void main(String[] args) {

		int[] arr = new int[] {2, 4, 9, 6, 3, 5, 2};
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			int j;
			for(j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					break;
				}
			}
			if(j == arr.length) {
				count++;
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		System.out.println("Total leaders :" + count);
	}

}
