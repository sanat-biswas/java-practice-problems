package hackerrank;

import java.util.Enumeration;
import java.util.Hashtable;

public class hash_Tables {

    public static void main(String[] args) {
        Hashtable<String, Double> ht = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;
        ht.put("Sanat", 1232.23);
        ht.put("Ashish", 2344.34);
        ht.put("Saurabh", 23435.45);

        names = ht.keys();

        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(ht.get(str));
        }

    }
}
