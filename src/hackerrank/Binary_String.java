package hackerrank;

public class Binary_String {

    public static void check_subStr() {
        String str = "01010101";
        String search = "010";
        String result = "";
        int i = 0;
        System.out.println(str.length());
        do {
            i = str.indexOf(search);
            if (i != -1) {
                System.out.println("Not Amazing");

                break;
            } else {
                System.out.println("Amazing");

            }
        } while (i != -1);


    }

    public static void main(String[] args) {
        check_subStr();


    }
}
