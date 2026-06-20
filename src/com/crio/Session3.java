package com.crio;

public class Session3 {

    public static String gradeMarks(float marks) {
        if (marks >= 80 && marks <= 100) {
            return "A";
        } else if (marks >= 60 && marks < 80) {
            return "B";
        } else if (marks >= 50 && marks < 60) {
            return "C";
        } else if (marks >= 45 && marks < 50) {
            return "D";
        } else if (marks >= 25 && marks < 45) {
            return "E";
        } else if (marks >= 0 && marks < 25) {
            return "F";
        } else {
            return "Invalid";
        }

    }


    public static boolean compareNumbers(int a, int b, int c) {
        if ((a == b) || (b == c)) {
            return true;
        }
        return false;
    }

    public static int findSmallest(int a, int b, int c) {
        if ((a < b) && (a < c)) {
            return a;
        } else if ((b < a) && (b < c)) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean isDescending(int a, int b, int c) {
        if ((a > b) && (b > c)) {
            return true;
        }
        return false;
    }

    public static String checkBloodDonationEligiblity(int age, int weight) {
        if (age < 18) {
            return "UnderAge";
        } else {
            if (weight < 50) {
                return "NotEligible";
            } else {
                return "Eligible";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(gradeMarks(101));
        System.out.println(gradeMarks(-1));
        System.out.println(gradeMarks(0));
        System.out.println(gradeMarks(80));
        System.out.println(compareNumbers(10, 99, 99));
        System.out.println(compareNumbers(101, 102, 103));
        System.out.println(findSmallest(3, 5, 6));
        System.out.println(findSmallest(6, 7, 4));
        System.out.println(findSmallest(5, 2, 7));
        System.out.println(isDescending(10, 9, 7));
        System.out.println(isDescending(10, 9, 11));
        System.out.println(checkBloodDonationEligiblity(18, 51));
        System.out.println(checkBloodDonationEligiblity(17, 60));
        System.out.println(checkBloodDonationEligiblity(18, 49));
    }
}
