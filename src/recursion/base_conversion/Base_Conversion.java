package recursion.base_conversion;

import java.util.Scanner;

public class Base_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the decimal number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		base_convert(n, 2);
		base_convert(n, 8);
		base_convert(n, 16);
	}
	
	public static void base_convert(int n, int base) {
		
		int rem = n % base;
		if(n == 0)
			return ;
		else
			base_convert(n/base, base);
		if(rem < 10)
			System.out.println("Remainder :" +rem);
		else
			System.out.println("Hex: " + (rem - 10 + 'A'));
	}

}
