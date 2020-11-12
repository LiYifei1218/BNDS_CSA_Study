package labs.lab2_3;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;

        int radius1 = 10;
        double area1 = PI * radius1 * radius1;
        double circumference1 = 2 * PI * radius1;

        System.out.println("The area of a circle with radius " + radius1 + " is " + area1 + ". The circumference is " + circumference1);
        int radius2 = 20;
        double area2 = PI * radius2 * radius2;
        double circumference2 = 2 * PI * radius2;

        System.out.println("The area of a circle with radius " + radius2 + " is " + area2 + ". The circumference is " + circumference2);

        double areaChange = area2 / area1;
        System.out.println("The change in area is " + areaChange);

        double circumferenceChange = area2 / area1;
        System.out.println("The change in circumference is " + circumferenceChange);
    }
}
