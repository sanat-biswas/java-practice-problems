package leetcode;

public class Palindrome {

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    public static boolean isPalindrome(int x) {
        if (reverse(x) == x)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234));
        System.out.println(isPalindrome(123));
        
    }
}
