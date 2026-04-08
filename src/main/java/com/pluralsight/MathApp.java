package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1
        //
        //Variables for question 1
        int bobSalary = 45000;
        int garySalary = 60000;
        int highestSalary = Math.max(bobSalary,garySalary);

        //whose salary is greater?

        System.out.println("the maximum is $" + highestSalary);

        //Question 2
        //which variable is lower?
        //Variables
        int carPrice = 26000;
        int truckPrice = 80000;
        int lowestPrice = Math.min(carPrice,truckPrice);

        System.out.println("The minimum is $" + lowestPrice);

        //Question 3
        //Variable
        double radius = 7.25;

        //Answer
        System.out.println("the area is " + Math.PI * (radius * radius) );

        //Question 4
        // Find and display the square root a variable after it is set to 5.0
        //Variable
        double number = 5.0;
        System.out.println("Square root of number 5.0 is " + Math.sqrt(number));

        //Question 5
        //Find and display the distance between the points (5, 10) and (85, 50)
        int a = 5;
        int b = 10;
        int p = 85;
        int q = 50;
        double distance = Math.sqrt(Math.pow(a-p, 2) + Math.pow(b-q, 2));
        System.out.println("Distance between points: " + distance);

        //Question 6
        //Find and display the absolute (positive) value of a variable after it is set to -3.8
        double absoluteValue = Math.abs (-3.8);
        System.out.println("Absolute Value of -3.8: " + absoluteValue);

        //Question 7
        //Find and display a number between 0 and 1
        double aRandomNumber = Math.random();
        System.out.println("A random number: " + aRandomNumber);

        //Question 8
        //. Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?




    }
}
