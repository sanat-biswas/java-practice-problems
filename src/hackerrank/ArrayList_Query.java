package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Query {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of arraylist: ");
        int n = s.nextInt();
        ArrayList<ArrayList<Integer>> l1 = new ArrayList<>();

        System.out.println("Enter the number of integers: ");
        for (int i = 0; i < n; i++) {
            int d = s.nextInt();
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                list.add(s.nextInt());
            }
            l1.add(list);

        }
        System.out.println("Enter the query: ");
        int q = s.nextInt();
        System.out.println("Enter the x and y: ");
        for (int i = 0; i < q; i++) {
            int x = s.nextInt();
            int y = s.nextInt();

            if (y > l1.get(x - 1).size()) {
                System.out.println("ERROR");
            } else {
                System.out.println(l1.get(x - 1).get(y - 1));
            }
        }


        for (int i = 0; i < l1.size(); i++) {
            System.out.print("ArrayList[" + (i + 1) + "] ");
            for (int j = 0; j < l1.get(i).size(); j++) {
                System.out.print(l1.get(i).get(j) + " ");
//                System.out.println();
            }
            System.out.println();
        }

        s.close();
    }

}
