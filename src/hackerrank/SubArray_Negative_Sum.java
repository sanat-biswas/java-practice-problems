package hackerrank;

public class SubArray_Negative_Sum {

    public static void subArray(int[] arr) {
        long beforeUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        int count = 0, sum, max = 0, flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                System.out.println("Sub Array :");
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("Sum = " + sum);
                if (sum < 0) {
                    count++;
                }

                if (sum > max) {
                    max = sum;
                    flag = 1;
                }
                System.out.println();
            }

        }
        if (flag == 0) {
            System.out.println("No Maximum Sum");
        }
        System.out.println("Count Negative Array Sum: " + count);
        System.out.println("Maximum Sum: " + max);

        long afterUsedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        System.out.println("Used Memory: " + (afterUsedMemory - beforeUsedMemory));
    }

    public static void main(String[] args) {


        int[] arr = {1, -2, 4, -5, 1};
        subArray(arr);



    }
}
