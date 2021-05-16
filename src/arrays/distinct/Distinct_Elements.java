package arrays.distinct;

public class Distinct_Elements {

	public static void main(String[] args) {
		int[] a = new int[] { 10, 20, 30, 40, 60, 90 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("not Distinct Elements");
					break;
				}else if(i == j){
					System.out.println("Distinct");
					
				}
//				if (i == j) {
//					System.out.println("Distinct");
//				}
			}
		}

	}

}
