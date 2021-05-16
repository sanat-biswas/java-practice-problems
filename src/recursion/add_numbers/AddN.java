package recursion.add_numbers;

public class AddN {

	public static void main(String[] args) {
		System.out.println(add(2));
	}
	
	public static int add(int n) {
		if(n==1)
			return 1;
		return (n + add(n-1));
	}

}
