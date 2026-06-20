package com.learning;

public class UpperCaseLettersInString {

    void upperCaseInString(String a) {
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                System.out.println(ch[i]);
            }
        }
    }

    public static void main(String[] args) {
        UpperCaseLettersInString uc = new UpperCaseLettersInString();
        uc.upperCaseInString("AmRIT PrashaNT SIngh");
    }
}
