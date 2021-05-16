package hackerrank;

public class FizzBuzz
{
    public static void main(String[] args) {
        int f = 3, b = 5;
        for(int i = 1; i <= 100; i++){
            if(i == f && i == b){
                System.out.println("FizzBuzz");
                f = f + 3;
                b = b + 3;
            }else if(i == f){
                System.out.println("Fizz");
                f += 3;
            }else if(i == b){
                System.out.println("Buzz");
                b += 5;
            }else{
                System.out.println(i);
            }
        }
    }
}
