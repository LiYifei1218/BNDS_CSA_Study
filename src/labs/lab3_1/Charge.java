package labs.lab3_1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Charge {
    public static void main(String[] args) {
        double previousBalance, additionalCharges;
        double interest = 0.0;
        double newBalance, minimumPayment = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print ("Enter the previous balance: ");
        previousBalance = input.nextDouble();

        System.out.print ("Enter the additional charges: ");
        additionalCharges = input.nextDouble();

        if (previousBalance == 0) {
            interest = 0;
        }
        else {
            interest = (previousBalance + additionalCharges) * 0.02;
        }

        newBalance = previousBalance + additionalCharges + interest;

        if (newBalance < 50) {
            minimumPayment = newBalance;
        }
        else if (newBalance >= 50 && newBalance <= 300) {
            minimumPayment = 50;
        }
        else if (newBalance > 300) {
            minimumPayment = newBalance * 0.2;
        }

        // Print the results
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println("Previous Balance:       " + money.format(previousBalance));
        System.out.println("Additional Charges:     " + money.format(additionalCharges));
        System.out.println("Interest:               " + money.format(interest));
        System.out.println();
        System.out.println("New Balance:            " + money.format(newBalance));
        System.out.println();
        System.out.println("Minimum Payment:        " + money.format(minimumPayment));
    }
}
