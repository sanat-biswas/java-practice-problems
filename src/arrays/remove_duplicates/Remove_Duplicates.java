package arrays.remove_duplicates;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 80, 20, 90, 40, 90 };

		int n = removeDuplicates(a);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("Length of array after removing: " + n);
		System.out.println();

	}

	public static int removeDuplicates(int[] a) {

		if (a.length == 0)
			return 0;
		int j = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				a[j++] = a[i];
			}
		}

		return j;
	}

}
