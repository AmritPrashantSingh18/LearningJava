package com.learning;

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

    public static String[] reverseStringArray(String[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            b[b.length - 1 - i] = word;
        }
        return b;
    }

    public static String checkBloodDonationEligiblity(int age, int weight) {
        if (age < 18) {
            return "UnderAge";
        } else if (age >= 18 && weight <= 50) {
            return "NonEligible";
        } else {
            return "Eligible";
        }
    }

    public static int totalStudents(int[][] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[0].length; j++) {
                sum = sum + students[i][j];
            }
        }
        return sum;
    }


    public static Integer matrixCenter(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix.length % 2 == 0 || matrix[0].length % 2 == 0) {
            return null;
        }
        int row = matrix.length;
        int column = matrix[0].length;

        return matrix[row / 2][column / 2];
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

        System.out.println(Arrays.toString(reverseStringArray(new String[]{"Amrit", "Prashant", "Singh"})));
        System.out.println(totalStudents(new int[][]{{25, 45}, {30, 45}}));
        System.out.println((matrixCenter(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));

    }
}
