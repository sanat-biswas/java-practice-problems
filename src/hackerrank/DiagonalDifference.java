package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void diagonalDifference(List<List<Integer>> arr) {
		int d1_sum = 0, d2_sum = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if(i == j) {
					d1_sum += arr.get(i).get(j);
				}
			}
		}
		
		for(int i = 0; i < arr.size(); i++) {
			for(int j = 0; j < arr.size(); j++) {
				if((i + j) == (arr.size() - 1)) {
					d2_sum += arr.get(i).get(j);
				}
			}
		}
		
		
		System.out.println(Math.abs(d1_sum - d2_sum));
	}

	public static void main(String[] args) {
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		List<Integer> l1 = new ArrayList<Integer>();
		
//		l1.add(1);
//		l1.add(2);
//		l1.add(3);
//		l1.add(4);
//		l1.add(5);
//		l1.add(6);
//		l1.add(9);
//		l1.add(8);
//		l1.add(9);
		
		for(int i = 0; i < 10; i++) {
			l1.add(i);
		}
		
		list.add(l1);
		
		System.out.println(list);
		
		diagonalDifference(list);
	}

}
