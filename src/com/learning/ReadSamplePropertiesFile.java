package com.learning;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadSamplePropertiesFile {

    public static void main(String[] args) throws Exception {
        String filePath = System.getProperty("user.dir");
        filePath = filePath + "\\src\\SamplePropertiesFile";
        File file = new File(filePath);
        FileInputStream fis = new FileInputStream(file);
        Properties pro = new Properties();
        pro.load(fis);
        String name = pro.getProperty("Name");
        String designation = pro.getProperty("Designation");
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}
