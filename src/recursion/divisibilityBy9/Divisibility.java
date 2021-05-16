package recursion.divisibilityBy9;

public class Divisibility {
	
	public static void main(String[] args) {
		System.out.println(divisible(729));
	}
	
	public static int divisible(int n) {
		int sum = 0;
		if(n == 9)
			return 1;
		if(n < 9)
			return 0;
		while(n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		
		return divisible(sum);
	}

}
