package treeSets;

import java.util.Scanner;

public class Can_you_access {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Inner.Private o = new Can_you_access.Inner().new Private();
        System.out.println(n + " is " + o.powerof2(n));
    }

    static class Inner{
        private class Private{
            private String powerof2(int n){
                return ((n & n - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}
