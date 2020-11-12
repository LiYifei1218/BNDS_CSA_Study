package labs.lab2_3;

import java.util.Scanner;
public class Paint {

    public static void main(String[] args) {
        final int COVERAGE = 350; //paint covers 350 sq ft/gal
        int length, width, height;
        double totalSqFt;
        double paintNeeded;
        int doorCount, windowCount;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the room:");
        length = input.nextInt();
        System.out.println("Enter the width of the room:");
        width = input.nextInt();
        System.out.println("Enter the height of the room:");
        height = input.nextInt();
        System.out.println("Enter the number of doors in the room:");
        doorCount = input.nextInt();
        System.out.println("Enter the number of windows in the room:");
        windowCount = input.nextInt();

        totalSqFt = length * height * 2 + width * height * 2;
        totalSqFt -= (windowCount * 15 + doorCount * 20);
        paintNeeded = totalSqFt / 350;

        System.out.println("length: " + length + "\nwidth: " + width + "\nheight: " + height);
        System.out.println("Need " + paintNeeded + " gallons of paint");

    }

}