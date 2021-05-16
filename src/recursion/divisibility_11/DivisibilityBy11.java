package recursion.divisibility_11;

public class DivisibilityBy11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divisibilityBy11(121));
	}
	
	public static int divisibilityBy11(int n) {
		int a1 = 0, a2 = 0, diff;
		if(n == 0)
			return 1;
		if(n < 10)
			return 0;
		while(n > 0) {
			a1 += n % 10;
			n /= 10;
			a2 += n % 10;
			n /= 10;
		}
		diff = a1 > a2 ? (a1 -a2) : (a2 - a1);
		return divisibilityBy11(diff);
	}

}
