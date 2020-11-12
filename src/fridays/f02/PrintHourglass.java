package fridays.f02;

import java.util.Scanner;

public class PrintHourglass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < (n + 1) / 2; i++) {
            String line = "";
            line += " ".repeat(i);
            line += "#".repeat(n - i * 2);
            System.out.println(line);
        }
        for (int i = (n - 3) / 2; i >= 0; i--) {
            String line = "";
            line += " ".repeat(i);
            line += "#".repeat(n - i * 2);
            System.out.println(line);
        }
    }
}
