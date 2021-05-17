package hackerrank;

class PrimeNumber {

    public static int checkPrime(int n) {
        int i = 2;
        while (n > 0) {
            if (n % i == 0) {
                break;
            }
            i++;
        }

        if (i == n)
            return n;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(checkPrime(11));
    }
}