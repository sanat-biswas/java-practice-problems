package recursion.digit_sum;

public class Sum_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dig_sum(12345));
		System.out.println(dig_sum(123456));
		System.out.println(dig_sum(45329));
	}
	
	public static int dig_sum(int n) {
		if(n / 10 == 0)
			return n;
		else if(n == 0)
			return 0;
		else
			return n % 10 + dig_sum(n/10);
	}

}
