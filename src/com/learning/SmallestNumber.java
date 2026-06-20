package com.learning;

public class SmallestNumber {

    public static int smallestInteger(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        } else if ((b < a) && (b < c)) {
            return b;
        } else {
            return c;
        }
    }

    public static String gradeMarks(double a) {
        if (a >= 80 && a <= 100) {
            return "A";
        } else if (a < 80 && a >= 60) {
            return "B";
        } else if (a < 60 && a >= 50) {
            return "C";
        } else if (a < 50 && a >= 45) {
            return "D";
        } else if (a < 45 && a >= 25) {
            return "E";
        } else if (a < 25 && a >= 0) {
            return "F";
        } else {
            return "invalid";
        }
    }

    public static boolean compareNumber(int a, int b, int c) {
        if ((a == b) || (b == c)) {
            return true;
        } else {
            return false;
        }
    }

    public static int addNums(int num) {
        int a = 1;
        int sum = 0;
        while (a <= num) {
            sum += a;
            a++;
        }
        return sum;
    }

    public static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(smallestInteger(3, 1, 2));
        System.out.println(gradeMarks(80));
        System.out.println(gradeMarks(79));
        System.out.println(gradeMarks(59));
        System.out.println(gradeMarks(49));
        System.out.println(gradeMarks(35));
        System.out.println(gradeMarks(24));
        System.out.println(gradeMarks(0));
        System.out.println(gradeMarks(-1));
        System.out.println(compareNumber(10, 10, 20));
        System.out.println(compareNumber(10, 20, 20));
        System.out.println(compareNumber(10, 30, 20));
        System.out.println(addNums(10));
        System.out.println(primeNumber(9));
        System.out.println(primeNumber(4));

    }
}
