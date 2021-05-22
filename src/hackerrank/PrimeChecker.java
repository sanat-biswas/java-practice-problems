package hackerrank;

import java.util.Arrays;

class Prime {

    public void checkPrime(int... n) {

        int[] isPrime = new int[n.length + 1];
        Arrays.fill(isPrime, 1);
        isPrime[0] = isPrime[1] = 1;
        for (int i = 2; i * i <= n.length; i++) {
            for (int j = i; j <= n.length; j += i) {
                isPrime[j] = 0;
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.print(isPrime[i] + " ");
        }
        System.out.println();
    }
}

public class PrimeChecker {
    public static void main(String[] args) {
        Prime p = new Prime();

         
        p.checkPrime(2, 3);
        p.checkPrime(2, 3, 4);
        p.checkPrime(2, 3, 4 ,5);

    }
}
