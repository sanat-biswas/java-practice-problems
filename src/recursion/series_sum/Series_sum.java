package recursion.series_sum;

public class Series_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(series(5));
		System.out.println(series(10));
	}
	
	public static int series(int n) {
		int sum = 0;
		if(n == 0)
			return 0;
		else
			sum = n + series(n-1);
			return sum;
	}

}
