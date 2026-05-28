public class MethodToPrintEvenIndexesFromArray {

    void indexArray(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MethodToPrintEvenIndexesFromArray a = new MethodToPrintEvenIndexesFromArray();
        int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        a.indexArray(x);
    }
}
