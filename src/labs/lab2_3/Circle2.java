package labs.lab2_3;

import java.util.Scanner;
public class Circle2 {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        int radius1;

        System.out.println("Please enter a value for the radius.");
        radius1 = input.nextInt();
        double area1 = PI * radius1 * radius1;
        double circumference1 = 2 * PI * radius1;

        System.out.println("The area of a circle with radius " + radius1 + " is " + area1 + ". The circumference is " + circumference1);
        int radius2 = 2 * radius1;
        double area2 = PI * radius2 * radius2;
        double circumference2 = 2 * PI * radius2;

        System.out.println("The area of a circle with radius " + radius2 + " is " + area2 + ". The circumference is " + circumference2);

        double areaChange = area2 / area1;
        System.out.println("The change in area is " + areaChange);

        double circumferenceChange = circumference2 / circumference1;
        System.out.println("The change in circumference is " + circumferenceChange);
    }
}
