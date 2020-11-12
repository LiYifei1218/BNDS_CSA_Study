package labs.lab3_2;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        System.out.println("Enter a non-negative integer to compute the factorial:");
        num = input.nextInt();

        while (num < 0) {
            System.out.println("Error: a non-negative number is required, please try again.");
            num = input.nextInt();
        }

        int current = 1, factorial = 1;

        while (current <= num) {
            factorial *= current;
            current ++;
        }

        System.out.println(factorial);
    }
}
