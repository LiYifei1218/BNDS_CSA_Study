package labs.lab4_2;

import java.util.Scanner;

public class BoosterSales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        BandBooster booster1 = new BandBooster("Tom");
        BandBooster booster2 = new BandBooster("Sam");

        System.out.println("Enter the number of boxes sold by " + booster1.getName() + " this week:");
        for (int i = 0; i < 3; i++) {
            booster1.updateSales(input.nextInt());
        }

        System.out.println("Enter the number of boxes sold by " + booster2.getName() + " this week:");
        for (int i = 0; i < 3; i++) {
            booster2.updateSales(input.nextInt());
        }

        System.out.println(booster1);
        System.out.println(booster2);
    }
}
