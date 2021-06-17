package statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StandardDeviation {
	
	public static void stdDev(List<Integer> arr) {
		
		int sum = 0;
		for(int i = 0; i < arr.size(); i++) {
			sum += arr.get(i);
		}
		
		int mean = sum / arr.size();
		
		long stdSum = 0;
		for(int i = 0; i < arr.size(); i++) {
			stdSum += Math.pow((arr.get(i) - mean), 2);
		}
		
		
		double deviation = stdSum / arr.size();
		
		
		System.out.println(String.format("%.1f",  Math.sqrt(deviation)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		List<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			arr.add(scan.nextInt());
		}
		
		stdDev(arr);
		
		scan.close();

	}

}
