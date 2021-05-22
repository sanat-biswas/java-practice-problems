package hackerrank;

public class ArrayLeftRotation {

    public static void arrayRotation(int[] arr, int n) {

        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void rotation(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            arrayRotation(arr, n);
        }        
    }

    public static void printRotation(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6 };
        rotation(arr, 2, arr.length);

        printRotation(arr);

    }

}
