package hackerrank;

public class Insert_At_Pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };

		int pos = 2;
		int y = 9;
		int n = arr.length;
		n++;
		for (int i = n; i >= pos; i--)
			arr[i] = arr[i + 1];
		arr[pos - 1] = y;

		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}

}
