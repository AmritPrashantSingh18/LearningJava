public class CovertLowerCaseToUpperCaseAndViceVersa {

    public static void main(String[] args) {
        char toUpperCase = 'a' - 32;
        System.out.println(toUpperCase);

        char toLowerCase = 'D' + 32;
        System.out.println(toLowerCase);

        System.out.println(toUpperCase('g'));
        System.out.println(toLowerCase('Y'));

        System.out.println((char) ('c' - 32));

    }

    public static char toUpperCase(char ch) {
        return (char) (ch - 32);
    }

    public static char toLowerCase(char ch) {
        return (char) (ch + 32);
    }
}
