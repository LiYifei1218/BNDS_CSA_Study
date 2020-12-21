package examples.ppt4;

import java.util.Scanner;

public class CalcDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        CalcDriven cal = new CalcDriven(x, y);
        System.out.println("Enter 1 for add, 2 for sub, 3 for mult, 4 for div");

        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println(cal.addition());
                break;
            case 2:
                System.out.println(cal.subtraction());
                break;
            case 3:
                System.out.println(cal.multiplication());
                break;
            case 4:
                System.out.println(cal.division());
        }

    }
}
