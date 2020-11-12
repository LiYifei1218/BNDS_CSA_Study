package labs.lab3_2;

// ****************************************************************
//   LoveCS.java
//   Use a while loop to print many messages declaring your
//   passion for computer science
// ****************************************************************

import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
        int LIMIT;
        int count = 1;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how many times to repeat: ");
        LIMIT = input.nextInt();

        while (count <= LIMIT)
        {
            sum += count;
            System.out.print(count);
            System.out.println(" I love Computer Science!!");
            count++;
        }

        System.out.println("Printed this message " + (count - 1) + " times. The sum of the numbers from 1 to " + (count - 1) + " is " + sum + ".");
    }
}

