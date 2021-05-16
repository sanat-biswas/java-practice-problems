package arrays.array_insertion;

public class Array_Insertion {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		int length = 0;
		for(int i = 0; i < 6; i++) {
			a[length] = i;
			length++;
		}
		
//		a[4] = 9;
		
		System.out.println("Array is: ");
		
		for(int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
