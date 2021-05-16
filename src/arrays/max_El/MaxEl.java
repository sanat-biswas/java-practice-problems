package arrays.max_El;

public class MaxEl {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int[] a = new int[] {1, 2, 4, 6, 7, 34};
		int max, min;
		min = max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] < min)
				min = a[i];
			if(a[i] > max)
				max = a[i];
		}
		
		System.out.println("Max: " + max + "\nMin: " + min);
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
