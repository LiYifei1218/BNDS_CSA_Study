package labs.lab3_3;

// **********************************************************
//   Count.java
//
//   This program reads in strings (phrases) and counts the
//   number of blank characters and certain other letters
//   in the phrase.
// **********************************************************

import java.util.Scanner;

public class Count
{
    public static void main (String[] args)
    {
        // Print a program header
        System.out.println();
        System.out.println("Character Counter");
        System.out.println();

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence or phrase, enter \"quit\" to exit: ");
        String phrase = scan.nextLine();    // a string of characters

        while (!phrase.equalsIgnoreCase("quit")) {

            int countBlank;   // the number of blanks in the phrase
            int countA = 0;
            int countE = 0;
            int countS = 0;
            int countT = 0;
            int length;       // the length of the phrase
            char ch;          // an individual character in the string

            length = phrase.length();

            // Initialize counts
            countBlank = 0;

            // a for loop to go through the string char by char
            // and count the blank spaces
            for (int i = 0; i < length; i++) {
                ch = phrase.charAt(i);
                switch (ch) {
                    case 'a':
                    case 'A':
                        countA++;
                        break;
                    case 'e':
                    case 'E':
                        countE++;
                        break;
                    case 's':
                    case 'S':
                        countS++;
                        break;
                    case 't':
                    case 'T':
                        countT++;
                        break;
                    case ' ':
                        countBlank++;
                        break;
                }
            }

            // Print the results
            System.out.println();
            System.out.println("Number of blank spaces: " + countBlank);
            System.out.println("Number of blank A's: " + countA);
            System.out.println("Number of blank E's: " + countE);
            System.out.println("Number of blank S's: " + countS);
            System.out.println("Number of blank T's: " + countT);
            System.out.println();

            // Read in a string and find its length
            System.out.print("Enter a sentence or phrase, enter \"quit\" to exit: ");
            phrase = scan.nextLine();
        }
    }
}

