package recursion.perfect;

public class Perfect_number {

	public static void main(String[] args) {
		perfect(28, 1);
	}

	public static void perfect(int n, int i) {
		if(i < n) {
			if(n % i == 0)
				System.out.print(i +  " ");
			perfect(n, i + 1);
		}
	}

}
