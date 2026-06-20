package com.learning;

public class CharacterArray {

    public static void main(String[] args) {

        char[] charArray = new char[10];
        charArray[0] = 'a';
        charArray[1] = 'b';
        charArray[2] = 'c';
        charArray[3] = 'd';
        charArray[4] = 'e';
        charArray[5] = 'f';
        charArray[6] = 'g';
        charArray[7] = 'h';
        charArray[8] = 'i';
        charArray[9] = 'j';

        int charLength = charArray.length;

        for (int i = 0; i < charLength; i += 2) {
            System.out.print(charArray[i] + " ");
        }

        System.out.println();
        System.out.println("====================");

        char[] anotherCharArray = {'t', 'u', 'v', 'w', 'x', 'y', 'z'};
        int anotherCharLength = anotherCharArray.length;
        for (int i = 0; i < anotherCharLength; i += 2) {
            System.out.print(anotherCharArray[i] + " ");
        }

        System.out.println();

        for (int i = anotherCharLength - 1; i >= 0; i--) {
            System.out.print(anotherCharArray[i] + " ");
        }

        System.out.println();

    }
}
