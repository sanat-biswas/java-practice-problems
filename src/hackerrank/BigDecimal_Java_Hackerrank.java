package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class BigDecimal_Java_Hackerrank {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s);


        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
