package fridays.f02;

import java.util.*;
public class ReverseWeight {
    public static void main(String[] args) {
        int total, mg, g, kg;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the total milligrams: ");
        total = input.nextInt();
        kg = total / 1000000;
        total %= 1000000;
        g = total / 1000;
        total %= 1000;
        mg = total;
        System.out.println(kg + "kg " + g + "g " + mg + "mg");
    }
}
