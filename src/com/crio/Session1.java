package com.crio;

public class Session1 {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        String selfName = "Amrit Prashant Singh";
        System.out.println("Hello, " + selfName);
        float length = 7.6F;
        float width = 4.8F;
        float perimeterOfRectangle = 2 * (length + width);
        float areaOfRectangle = length * width;
        System.out.println("Perimeter of Rectangle: " + perimeterOfRectangle);
        System.out.println("Area of Rectangle: " + areaOfRectangle);
        char a = 'J';
        char b = 'A';
        char c = 'V';
        String dataCreated = "" + a + b + c + b;
        System.out.println(dataCreated);
        int years = 6;
        int days = 365 * years;
        System.out.println("Year Converted Into Days: " + days);
        int number = 9;
        int cubeOfNumber = number * number * number;
        System.out.println("Cube of a number: " + cubeOfNumber);

    }
}
