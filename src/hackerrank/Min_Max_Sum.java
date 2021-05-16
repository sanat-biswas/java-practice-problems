package hackerrank;

public class Min_Max_Sum {

    public static void minMaxSum(int[] arr) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(sum - max);
        System.out.println(sum - min);
    }

    public static void main(String[] args) {
        
        int[] arr = { 1, 3, 5, 7, 9 };
        minMaxSum(arr);
        
    }
    
}
