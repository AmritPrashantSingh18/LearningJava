package com.learning;

public class ComparingTwoArrays {

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60};
        int[] b = {20, 40, 60, 80, 100, 120};

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    count++;
                    break;
                }
            }
        }

        int[] c = new int[count];
        int k = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                    break;
                }
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
        System.out.println();
    }

}
