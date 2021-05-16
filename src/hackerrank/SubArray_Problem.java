package hackerrank;

public class SubArray_Problem {
    public static void main(String[] args) {
        int[] arr = {3, 3, 9, 9, 5};

        subArrays(arr, 7);

    }

    public static void subArrays(int[] arr, int m) {
        int b, flag = 0, k;
        int max = 0, mod = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print("Sub Array: ");
                b = 0;
                for (k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    b += arr[k];
                }

                System.out.print("Sum: " + b);
                mod = ((arr[i] + arr[j]) % m)%m;
                System.out.println(" Mod: " + mod);

                if (mod > max) {
                    max = mod;
                    flag = 1;
                }
                System.out.println();
            }
        }

        System.out.println("Max Mod: " + max);

        if (flag == 0) {
            System.out.println("No max mod");
        }
    }

    public static int returnSum(int[] arr, int k) {

        return k;
    }
}
