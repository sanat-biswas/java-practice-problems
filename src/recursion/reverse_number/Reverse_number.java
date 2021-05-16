package recursion.reverse_number;

public class Reverse_number {

	private static int rev = 0;
	private static int base_pos = 1;
	public static void main(String[] args) {
		System.out.println("Reverse: "+reverse(123456));

	}

	public static int reverse(int n) {
		if (n == 0)
			return 0;
		if (n > 0) {
			reverse(n / 10);
			rev += base_pos * (n % 10);
			base_pos *= 10;
			
		}

		return rev;
	}

}
