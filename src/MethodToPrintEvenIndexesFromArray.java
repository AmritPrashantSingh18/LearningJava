public class MethodToPrintEvenIndexesFromArray {

    void indexArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    void sumOfIntegersStoredInArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

    void compareCountOfValueInTheArray(int[] a, int b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count++;
            }
        }
        System.out.println("Count: " + count);
        if (count == 0) {
            System.out.println("Number not in the list of array");
        }
    }

    public static void main(String[] args) {
        MethodToPrintEvenIndexesFromArray a = new MethodToPrintEvenIndexesFromArray();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        a.indexArray(x);
        int[] b = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        a.sumOfIntegersStoredInArray(b);
        int[] c = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 22, 24, 23, 24, 24, 25};
        a.compareCountOfValueInTheArray(c, 24);
        a.compareCountOfValueInTheArray(c, 10);
    }
}
