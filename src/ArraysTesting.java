import java.util.Arrays;

public class ArraysTesting {

    public static int smallestIntegerInArray(int[] a) {
        Arrays.sort(a);
        return a[0];
    }

    public static int smallestInteger(int[] a) {
        int smallestNumber = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallestNumber > a[i]) {
                smallestNumber = a[i];
            }
        }
        return smallestNumber;
    }

    public static int sumOfTwoArrays(int[] a, int[] b) {
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        for (int j = 0; j < b.length; j++) {
            sum += b[j];
        }


        return sum;

    }

    public static int searchTarget(int num, int[] a, int targetNumber) {
        for (int i = 0; i < num; i++) {
            if (targetNumber == a[i]) {
                return 1;
            }
        }
        return -1;

    }

    public static void reverseArray(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(smallestIntegerInArray(new int[]{90, 56, 40, 20, 10, 11}));
        int[] a = {60, 89, 97, 100, 40, 3, 50, 78};
        System.out.println(smallestInteger(a));

        int[] b = {5, 6, 9, 8, 6};
        int[] c = {8, 9, 3, 5, 4};
        System.out.println(sumOfTwoArrays(b, c));
        reverseArray(b);

        System.out.println(searchTarget(5, b, 8));
        System.out.println(searchTarget(5, c, 10));


    }
}
