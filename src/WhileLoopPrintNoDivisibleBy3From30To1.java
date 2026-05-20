public class WhileLoopPrintNoDivisibleBy3From30To1 {

    public static void main(String[] args) {
        int i = 30;
        while (i >= 1) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
