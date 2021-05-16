package hackerrank;

public class maximum {

    public static void main(String[] args) {
        int n = 23, m = 34, max = 0, flag = 0;

        if(n > max){
            max = n;
            System.out.println("max = " +max);
            flag = 1;
        }

        if(flag == 0){
            System.out.println("Max = " + m);
        }
    }
}
