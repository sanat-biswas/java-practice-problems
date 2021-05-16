package hackerrank;

import java.util.ArrayList;
import java.util.List;


public class Birthday_Candles {

    public static int birthDayCakeCandles(List<Integer> candles) {

        int max = 0, count = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);

            }
        }
        
        for (int i = 0; i < candles.size(); i++) {
            if (max == candles.get(i)) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        return max;
    } 

    public static void main(String[] args) {

        List<Integer> candles = new ArrayList<>();

        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);

        System.out.println("Maximum Candle = " + birthDayCakeCandles(candles));
        
    }
    
}
