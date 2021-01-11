package labs.lab5_5;

// ****************************************************************
// SquareTest.java
//
// Uses the Square class to read in square data and tell if
// each square is magic.
//
// ****************************************************************

import java.util.Scanner;
import java.io.*;

public class SquareTest
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(new File("/Users/liyifei/Library/Mobile Documents/com~apple~CloudDocs/Documents/BNDS_AP/G12/CSA/Projects/src/labs/lab5_5/magicData"));

        int count = 1;                 //count which square we're on
        int size = scan.nextInt();     //size of next square

        //Expecting -1 at bottom of input file
        while (size != -1)
        {

            //create a new Square of the given size
            Square sq = new Square(size);

            //call its read method to read the values of the square
            sq.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");
            //print the square
            sq.printSquare();

            //print the sums of its rows
            for (int i = 0; i < size; i++)
                System.out.println("Row " + (i + 1) + " sum: " + sq.sumRow(i));

            //print the sums of its columns
            for (int i = 0; i < size; i++)
                System.out.println("Column " + (i + 1) + " sum: " + sq.sumCol(i));

            //print the sum of the main diagonal
            System.out.println("Main diagonal sum: " + sq.sumMainDiag());

            //print the sum of the other diagonal
            System.out.println("Other diagonal sum: " + sq.sumOtherDiag());

            //determine and print whether it is a magic square
            if (sq.magic())
                System.out.println("\nSquare " + count + " is a magic square");
            else
                System.out.println("\nSquare " + count + " is not a magic square");

            //get size of next square
            size = scan.nextInt();
            count ++;
        }

    }
}

