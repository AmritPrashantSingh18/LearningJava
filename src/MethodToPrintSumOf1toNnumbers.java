public class MethodToPrintSumOf1toNnumbers {

    public static int sumOf1toNnumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int sumOf1toNnumbers1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOf1toNnumbers(100));
        MethodToPrintSumOf1toNnumbers m = new MethodToPrintSumOf1toNnumbers();
        int a = m.sumOf1toNnumbers1(200);
        System.out.println(a);
    }
}
