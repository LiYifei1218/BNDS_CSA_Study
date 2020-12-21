package examples.ppt5;

import java.util.Scanner;

public class Salespeople {
    public static void main(String[] args) {

        System.out.println("Please input the number of current salespeople at the company:");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;
        double max = -1;
        double min = 2147483647;
        int maxNum = -1;
        double minNum = -1;

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the sales of salespeople No." + (i + 1));
            arr[i] = input.nextInt();
            total += arr[i];
            if (arr[i] < min) { min = arr[i]; minNum = (i + 1); }
            if (arr[i] > max) { max = arr[i]; maxNum = (i + 1); }
        }

        System.out.println("total is " + total);
        System.out.println("average is " + total / n);
        System.out.println("min sales is No." + minNum + min);
        System.out.println("max sales is No." + maxNum + max);

    }
}
