package recursion.prime_factors;

public class Prime_Factors {

	public static void main(String[] args) {

		factors(55);

	}

	public static void factors(int n) {

		int i = 2;
		if (n == 1)
			return;
		else {
			while (n % i != 0) {
				i++;
			}
			System.out.println(i);
			factors(n / i);
		}
	}

}
