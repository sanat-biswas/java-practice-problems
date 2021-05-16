package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Triplets_Compare {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> c = new ArrayList<>();
        
        int alice_count = 0, bob_count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice_count++;
            } else if (a.get(i) < b.get(i)) {
                bob_count++;
            } else if (a.get(i) == b.get(i)) {
                // alice_count = bob_count = 0;
            }
        }
        c.add(alice_count);
        c.add(bob_count);

        System.out.println("Alice_Count "+alice_count);
        System.out.println("Bob_Count "+bob_count);
        
        return c;
    }

    public static void main(String[] args) {
        
        List<Integer> l1 = new ArrayList<>();
        l1.add(17);
        l1.add(28);
        l1.add(30);

        List<Integer> l2 = new ArrayList<>();
        l2.add(99);
        l2.add(16);
        l2.add(8);

        System.out.println(compareTriplets(l1, l2));


        
        
    }
    
}
