public class MethodToPrintSumOf1toNnumbers {

    public static int sumOf1toNnumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumOf1toNnumbers2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = (n * (n + 1)) / 2;
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

    int sumOfEvenNumbers(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOf1toNnumbers(100));
        MethodToPrintSumOf1toNnumbers m = new MethodToPrintSumOf1toNnumbers();
        int a = m.sumOf1toNnumbers1(200);
        System.out.println(a);
        System.out.println(sumOf1toNnumbers2(100));
        int b = m.sumOfEvenNumbers(20);
        System.out.println(b);

    }
}
