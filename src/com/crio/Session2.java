package com.crio;

public class Session2 {

    public static String fullName(String firstName, String secondName) {
        return firstName + " " + secondName;
    }

    public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int largestOfTwoNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String evenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static boolean isEqual(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static int remainderOfTwoNumbers(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(fullName("Amrit", "Singh"));
        System.out.println(sumOfTwoNumbers(909, 101));
        System.out.println("Largest Number: " + largestOfTwoNumber(2, 5));
        System.out.println(evenOrOdd(5));
        System.out.println(isEqual(5, 4));
        System.out.println(remainderOfTwoNumbers(5, 3));
    }
}
