package hackerrank;

public class SpecialSubStringCount {
    public static boolean specialString(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1))
                return false;

        }
        return true;
    }

    public static void main(String[] args) {

        if (specialString("aaa")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

}
