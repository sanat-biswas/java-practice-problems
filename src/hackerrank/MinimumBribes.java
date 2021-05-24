package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    public static void miniMumBribes(List<Integer> arr) {

        int bribes = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((arr.get(i) - arr.get(i + 1)) > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, arr.get(i) - 2); j < i; j++) {
                if (arr.get(j) > arr.get(i)) {
                    bribes++;
                }
            }
        }

        System.out.println(bribes);

    }
}

public class MinimumBribes {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] qTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> q = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qTemp[i]);
                q.add(qItem);
            }

            Result.miniMumBribes(q);
        }

        bufferedReader.close();
    }

}
