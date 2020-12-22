package labs.lab5_1;

import java.util.Scanner;

public class GradingQuizzes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String flag = "yes";
        do {
            System.out.print("Enter the number of questions: ");

            int num = input.nextInt();
            int correct = 0;
            int[] key = new int[num];

            System.out.println("Enter the keys for " + num + " questions: ");

            for (int i = 0; i < num; i++) {
                key[i] = input.nextInt();
            }
            System.out.println("Enter the answers for " + num + " questions: ");

            for (int i = 0; i < num; i++) {
                if (key[i] == input.nextInt()) {
                    correct++;
                }
            }

            System.out.println(correct);
            System.out.println(correct / num);

            System.out.println("Another Quiz? (y/n)");
            flag = input.next();
        } while (flag.equalsIgnoreCase("y"));
    }
}
