package hackerrank;

import java.util.BitSet;
import java.util.Scanner;

public class BitSet_problem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        int m, n;
        m = scan.nextInt();
        n = scan.nextInt();
        BitSet set1 = new BitSet(m);
        BitSet set2 = new BitSet(m);
        for(int i = 0; i < n; i++) {
            String operation = scan.next();
            int first = scan.nextInt();
            int second = scan.nextInt();
            if(operation.equals("AND")) {
                if(first == 1) {
                    set1.and(set2);
                } else {
                    set2.and(set1);
                }
            } else if(operation.equals("OR")) {
                if(first == 1) {
                    set1.or(set2);
                } else {
                    set2.or(set1);
                }
            } else if(operation.equals("XOR")) {
                if(first == 1) {
                    set1.xor(set2);
                } else {
                    set2.xor(set1);
                }
            } else if(operation.equals("SET")) {
                if(first == 1) {
                    set1.set(second);
                }else {
                    set2.set(second);
                }
            } else if(operation.equals("FLIP")) {
                if(first == 1) {
                    set1.flip(second);
                }else {
                    set2.flip(second);
                }
            } 
            System.out.println(set1.cardinality() + " " + set2.cardinality());
        }

	}
}
