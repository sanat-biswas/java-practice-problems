package arrays.even_odd;

public class EvenOddCount {

	public static void main(String[] args) {
		int[] a = new int[] {1, 3, 2, 5, 4, 7, 9, 64};
		int even = 0, odd = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] % 2 == 0)
				even++;
			else 
				odd++;
		}
		System.out.println("Even: " + even);
		System.out.println("Odd: " + odd);

	}

}
