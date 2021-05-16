package recursion.greatest_common_divisor;


public class GCD {

	public static void main(String[] args) {
		System.out.println(gcd(35, 21));
	}
	
	public static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b, a%b);
	}

}
