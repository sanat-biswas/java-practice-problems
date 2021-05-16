package prime_generator;

import java.util.Scanner;

public class Prime_generator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input");
		int t = s.nextInt();
		
		System.out.println("Enter numbers");
		for(int i = 1; i <= t; i++) {
			int n = s.nextInt();
			
			int count = 0;
			for(int div = 1; div <= n; div++) {
				if(n % div == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(n + " Prime");
			}else {
				System.out.println("Not prime");
			}
		}

	}

}
