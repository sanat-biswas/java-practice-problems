package hackerrank;

import java.util.Scanner;

public class Mini_Mat_Area {

    public static void minArea(int l1, int l2) {

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter l1: ");
        int l1 = s.nextInt();
        System.out.println("Enter b1: ");
        int b1 = s.nextInt();

        int[] length = new int[l1];
        int[] breadth = new int[b1];
        int n = length.length + breadth.length;
        int[] res = new int[n];

        System.out.println("Enter array: ");
        for (int i = 0; i < l1; i++) {
            System.out.println("Enter Element: " + i);
            length[i] = s.nextInt();
            breadth[i] = s.nextInt();

            res[i] = breadth[i] * length[i];

        }

        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }


    }
}
