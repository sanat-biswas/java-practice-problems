package hackerrank;

public class ListArr {

    public static void main(String[] args) {

        int[] arr = {7, 1, 3, 2, 4, 5, 6};

        System.out.println("No. of swaps: " + minimum_swaps(arr));

    }

    public static int minimum_swaps(int[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length-1; i++) {
            while (arr[i] != i + 1) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }

        return swaps;
    }
}
