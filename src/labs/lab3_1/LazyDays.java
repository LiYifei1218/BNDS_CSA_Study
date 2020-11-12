package labs.lab3_1;

import java.util.Scanner;

public class LazyDays {
    public static void main(String[] args) {
        double temperature = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the current temperature: ");
        temperature = scan.nextDouble();

        if (temperature > 95 || temperature < 25) {
            System.out.println("Visit our shops!");
        }
        else if (temperature >= 80) {
            System.out.println("swimming");
        }
        else if (temperature >= 60) {
            System.out.println("tennis");
        }
        else {
            System.out.println("skiing");
        }
    }
}
