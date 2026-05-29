public class StringSplit {

    void stringSplit(String n) {
        String[] toChar = n.split("");
        for (String ch : toChar) {
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println(toChar.length);
    }

    void stringSplit1(String n) {
        char[] ch = n.toCharArray();
        for (char cc : ch) {
            System.out.print(cc + " ");
        }
        System.out.println();
        System.out.println(ch.length);
    }

    void reverseString(String n) {
        String reverse = "";
        for (int i = n.length() - 1; i >= 0; i--) {
            System.out.print(reverse + n.charAt(i));
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StringSplit sp = new StringSplit();
        sp.stringSplit("AABBCCddEeFFGg");
        sp.stringSplit1("hsgsshsgsgaggshsa");
        sp.reverseString("Amrit");
    }
}
