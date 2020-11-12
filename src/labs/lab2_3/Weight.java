package labs.lab2_3;

import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heightFeet, heightInch, totalInches;
        System.out.println("Please input your height (feet):");
        heightFeet = input.nextInt();
        System.out.println("Please input your height (inch):");
        heightInch = input.nextInt();

        totalInches = 12 * heightFeet + heightInch;
        int inchesAbove = totalInches - 5 * 12;
        int idealFemale = 100 + 5 * inchesAbove;
        int idealMale = 106 + 6 * inchesAbove;

        System.out.println("The ideal female weight of your height is " + idealFemale + ".\nThe ideal male weight of your height is " + idealMale);
        System.out.println("The ideal female range of weight of your height is from " + idealFemale * 0.85 + " to " + idealFemale * 1.15 + ".\nThe ideal male range of weight of your height is from " + idealFemale * 0.85 + " to " + idealFemale * 1.15);
    }
}
