/**
 * 
 */
package oops;

public class CGPA {

	public static double calCgpa(double[] marks, int n) {
		double[] grades = new double[n];
		double cgpa, sum = 0;

		for (int i = 0; i < n; i++) {
			grades[i] = marks[i] / 10;
			
		}

		for (int i = 0; i < n; i++) {
			sum += grades[i];
			
		}

		cgpa = (sum / n);
		
		double avgCgpa = 3*(cgpa) / 3; 
		return avgCgpa;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		double[] marks = { 90, 80, 70, 80, 90 };
		double cgpa = calCgpa(marks, n);
		System.out.println("AVG CGPA = " + cgpa);

	}

}
