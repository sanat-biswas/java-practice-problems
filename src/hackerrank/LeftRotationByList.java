package hackerrank;

import java.util.*;

public class LeftRotationByList {

    public static void rotateLeft(List<Integer> arr, int n) {

        for (int j = 0; j < 4; j++) {

            int temp = arr.get(0);

            for (int i = 0; i < n - 1; i++) {
                arr.set(i, arr.get(i + 1));
            }

            arr.set(n - 1, temp);
        }
    }

    public static void printRotation(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        rotateLeft(arr, 5);
        printRotation(arr);


        
    }
}
