package statistics;

import java.util.ArrayList;
import java.util.List;

public class WeightedMean {

	public static void weightedMean(List<Integer> mean, List<Integer> weights) {

		double sum = 0, ws = 0;
		for (int i = 0; i < mean.size(); i++) {
				sum += (mean.get(i) * weights.get(i));
				
				ws += weights.get(i);
		}
		
		double wm = (double)(sum / ws);

		System.out.println(String.format("%.1f", wm));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> mean = new ArrayList<>();
		List<Integer> weights = new ArrayList<>();
		
		mean.add(1);
		mean.add(2);
		mean.add(3);
		
		weights.add(5);
		weights.add(6);
		weights.add(7);
 		
		weightedMean(mean, weights);

	}

}
