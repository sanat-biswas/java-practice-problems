package arrays.swap_adjacent;

public class Swap_Adjacent {
	public static void main(String[] args) {
		int[] a = new int[] {20, 40, 50, 60, 30, 10};
		System.out.println("before swap: ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
		
		for(int i = 0; i < a.length-1; i+=2) {
			int temp = a[i];
			a[i] = a[i+1];
			a[i+1] = temp;
		}
		
		System.out.println("After swap:" );
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		
	}
}
