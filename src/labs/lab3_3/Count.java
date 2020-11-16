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
        String phrase;    // a string of characters
        int countBlank;   // the number of blanks in the phrase

        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scan = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.print ("Enter a sentence or phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        // Initialize counts
        countBlank = 0;

        // a for loop to go through the string char by char
        // and count the blank spaces
        for (int i = 0; i < length; i++) {
            ch = phrase.charAt(i);
            if (ch == ' ') {
                countBlank ++;
            }
        }

        // Print the results
        System.out.println ();
        System.out.println ("Number of blank spaces: " + countBlank);
        System.out.println ();
    }
}

