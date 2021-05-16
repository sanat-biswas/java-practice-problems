package largest_smallest_difference;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {10, 20 ,30, 40, 50 ,60};
		int max, min;
		max = min = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max)
				min = max;
				max = a[i];
			if(a[i] > min && a[i] != max )
				min = a[i];
		}
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
//		int diff = max - min;
//		System.out.println(diff);

	}

}
