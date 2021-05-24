package leetcode;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if ((arr[j] + arr[i]) == target) {
                    System.out.println("["+i + ", " + j+"]");
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 11, 7, 15 };
        int target = 9;
        twoSum(arr, target);
    }
}
