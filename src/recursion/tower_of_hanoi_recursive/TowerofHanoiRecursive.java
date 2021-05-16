package recursion.tower_of_hanoi_recursive;

public class TowerofHanoiRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char src = 'A', temp = 'B', des = 'C';
		int n = 70;
		tofh(n, src, temp, des);

	}

	public static void tofh(int ndisk, char src, char temp, char des) {
		if (ndisk == 1) {
			System.out.println("Move disk " + ndisk + " from " + src + " -> " + des);
			return;
		}
		tofh(ndisk - 1, src, des, temp);
		System.out.println("Move disk " + ndisk + " from " + src + " -> " + des);
		tofh(ndisk - 1, temp, src, des);
	}

}
