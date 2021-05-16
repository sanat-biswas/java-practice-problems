package recursion.fibonacci_series;

public class Fibonacci_Series {

	public static void main(String[] args) {
		System.out.println(fib(4));
		System.out.println(fib(5));
	}
	
	public static int fib(int n) {
		if(n < 1)
			return 0;
		else if(n == 1 || n == 2)
			return n-1;
		else
			return fib(n-1) + fib(n-2);
	}
}


/**
 * fib(5)=2 + 1
 * * */