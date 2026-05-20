public class SumOfNosUsingForLoops {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }


        System.out.println("Sum is " + sum);
        System.out.println("Count of it divided by 3 is " + count);
    }
}
