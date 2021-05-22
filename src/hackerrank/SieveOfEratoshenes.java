package hackerrank;

import java.util.Arrays;

public class SieveOfEratoshenes {

    public static int[] sieve(int n) {
        int[] isPrime = new int[n + 1];
        Arrays.fill(isPrime, 1);

        isPrime[0] = isPrime[1] = 0;

        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = 0;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int[] isPrime = sieve(12);

        for (int i = 0; i < isPrime.length; i++) {
            System.out.println(i +" "+ isPrime[i]);
        }
    }

}
