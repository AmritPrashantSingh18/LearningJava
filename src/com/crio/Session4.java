package com.crio;

public class Session4 {

    public static int addNums(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static int naturalSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean checkPrime(int num) {
        if (num == 1 || num == 2) {
            return false;
        } else {
            for (int i = 2; i < num - 1; i++) {
                if (num % 2 == 0) {
                    break;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(addNums(4));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(11));
        System.out.println(naturalSum(10));

    }
}
