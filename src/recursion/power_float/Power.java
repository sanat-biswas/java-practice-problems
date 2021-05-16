package recursion.power_float;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("%.2f", power(1.6, 2));

	}
	
	public static double power(double d, int n) {
		if(n == 0)
			return 1;
		else
			return  (d * power(d, n-1));
	}

}
