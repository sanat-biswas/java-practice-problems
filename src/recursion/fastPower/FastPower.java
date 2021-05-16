package recursion.fastPower;

public class FastPower {

	public static long  count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fastPower(3, 4));
		System.out.println("Steps: " +count);
	}
	
	public static long fastPower(long a, long b) {
		System.out.println(b);
		count++;
		if(b == 0) {
			return 1;
		}
		if(b%2 == 0) {
			
			return (a * fastPower(a*a, b/2));
		}
		return (a * fastPower(a, b-1));
	}

}
