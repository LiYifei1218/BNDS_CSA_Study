package fridays.f02;

import java.util.*;
public class Cir {
    public static void main(String[] args) {
        double c;
        final double PI = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the circumfrence of the circle: ");
        c = input.nextDouble();

        System.out.println("The radius is: " + (c / 2 / PI));
    }
}
