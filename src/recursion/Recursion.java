package recursion;

public class Recursion {
	
	public static void foo(int n) {
		if(n < 1)
			return;
		else
			foo(n-1);
		System.out.println("Hello World " + n);
	}

	public static void main(String[] args) {
		foo(3);

	}

}
