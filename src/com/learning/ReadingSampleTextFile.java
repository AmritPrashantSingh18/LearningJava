package com.learning;

import java.io.File;
import java.util.Scanner;

public class ReadingSampleTextFile {

    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\Amrit Prashant Singh\\Downloads\\LearningJava\\src\\SampleTestFile";
        File fileName = new File(filePath);
        Scanner sc = new Scanner(fileName);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }

        System.out.println("=======================");

        String filePath1 = System.getProperty("user.dir");
        System.out.println(filePath1);
        filePath1 = filePath1 + "\\src\\SampleTestFile";
        File fileName1 = new File(filePath1);
        Scanner sc1 = new Scanner(fileName1);
        while (sc1.hasNextLine()) {
            System.out.println(sc1.nextLine());
        }

    }
}
