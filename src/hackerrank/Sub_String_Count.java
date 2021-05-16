package hackerrank;

import java.util.Scanner;

public class Sub_String_Count {

    public static void subString(String str) {
        int count = 0;
        char[] ch = str.toCharArray();

        int c = ch.length;

        for (int i = 0; i < ch.length; i++) {

            for (int j = i; j < ch.length; j++) {
                int sp = 0;
                for (int k = i; k <= j; k++) {
                    sp = ch[k];

                    String sd = Character.toString((char) sp);
//                    System.out.print(ch[k] + " ");
//                    count = k * (k + 1) / 2;
//                    System.out.print(Character.toUpperCase(Integer.parseInt(String.valueOf(sp))));
                    System.out.print(sd + " ");

                }
                System.out.println();


            }

        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "gEEk";

        int n = str.length();

        int counts = n * (n + 1) / 2;
        System.out.println(" Total substring: " + counts);
        subString(str);

    }
}
