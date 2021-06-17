package hackerrank;

import java.util.*;

class Sorting {

    public static void sortPizza(List<Integer> arr) {

        Collections.sort(arr, Collections.reverseOrder());

        long weights = 0;
        int i, j;
        for (i = 2, j = 0; j < arr.size() / 4; i += 3, j++) {
            weights += arr.get(i);

        }

        System.out.println(arr);

        System.out.println(weights);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            arr.add(s.nextInt());
        }

        sortPizza(arr);

        s.close();

    }
}
