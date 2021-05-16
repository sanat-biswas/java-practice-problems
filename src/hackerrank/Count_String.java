package hackerrank;

public class Count_String {

    public static void main(String[] args) {
//        String[] str = {"g", "E", "E", "k"};
        String str = "gEEk";
        int count = 0;
        char[] ch = str.toCharArray();
        for(char i = 'a'; i < 'z'; i++){
//            if(Character.isUpperCase(ch[i])){
//                System.out.println("UpperCase");
//                count++;
//            }else{
//                System.out.println("LoweCase");
//            }

            System.out.println((String.valueOf(i)) + " " + (int) i);
            count++;
        }
        System.out.println("Upper Case: " + count);
    }
}
