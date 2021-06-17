package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListSummation {
    public static void findMinimumEqualSum(List<Integer> listA, List<Integer> listB) {

        int n = listA.size();

        int m = listB.size();

        for (int i = 0; i < n; i++) {
            if (listA.get(i) == 0) {
                listA.remove(i);
                listA.set(i, 5);
            }
        }

        for (int j = 0; j < m; j++) {
            if (listB.get(j) == 0) {
                listB.remove(j);
                listB.set(j, 10);
            }
        }

        // List<Integer> listC = Stream.concat(listA.stream(), listB.stream()).collect(Collectors.toList());

        // for (int i = 0; i < listC.size() - 1; i++) {
        //     if (listC.get(i) == 0) {
        //         listC.remove(i);

        //         listC.add(5);
        //     }
        // }
        System.out.println(listA);
        System.out.println(listB);

    }

    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();

        listA.add(1);
        listA.add(0);
        listA.add(2);

        List<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(3);
        listB.add(0);
        listB.add(0);

        findMinimumEqualSum(listA, listB);
        
    }
}
