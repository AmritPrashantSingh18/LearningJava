package com.learning;

public class EvenOrOddLengthOfString {

    void evenOrOddLengthString(String n) {
        int length = n.length();
        System.out.println(length);
        if (length % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    void numberOfVowels(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch != 'a' && ch != 'A' && ch != 'e' && ch != 'E' && ch != 'i' && ch != 'I' && ch != 'o' && ch != 'O' && ch != 'u' && ch != 'U') {
                count++;
            }
        }
        System.out.println("Number Of Vowels: " + count);
    }


    public static void main(String[] args) {
        EvenOrOddLengthOfString str = new EvenOrOddLengthOfString();
        str.evenOrOddLengthString("Amrit");
        str.evenOrOddLengthString("Prashant");
        String a = "Quality Thoughts";
        String b = a.substring(3);
        char c = a.charAt(4);
        str.numberOfVowels("AUTONOMOUS");
        str.numberOfVowels("elephant");
    }
}
