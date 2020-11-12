package labs.lab3_2;

// ****************************************************************
//   Guess.java
//   Play a game where the user guesses a number from 1 to 10
// ****************************************************************
import java.util.Scanner;

public class Guess
{
    public static void main(String[] args)
    {
        String toContinue = "y";
        while (toContinue.equalsIgnoreCase("y")) {
            int numToGuess;       //Number the user tries to guess
            int guess;            //The user's guess
            int count = 0, highCount = 0, lowCount = 0;

            Scanner scan = new Scanner(System.in);

            numToGuess = (int)(100 * Math.random()) + 1; //randomly generate the number to guess

            System.out.println("\nPlease guess:"); //print message asking user to enter a guess

            guess = scan.nextInt(); //read in guess

            while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                String result;
                if (guess > numToGuess) {
                    result = "too high";
                    highCount ++;
                }
                else {
                    result = "too low";
                    lowCount ++;
                }

                System.out.println("Sorry, the guess is " + result + ", please try again."); //print message saying guess is wrong
                guess = scan.nextInt(); //get another guess from the user
                count ++;
            }

            System.out.println("\nCongratulations! Your guess is correct.");
            System.out.println("You've guessed " + count + " times.\nWith " + highCount + " times too high and " + lowCount + " times too low."); //print message saying guess is right

            System.out.println("\nEnter Y to continue...");
            toContinue = scan.next();
        }
    }
}
