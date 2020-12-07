package labs.lab4_1;

// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    private Scanner input = new Scanner(System.in);
    private String name;
    private double score1, score2;

    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        name = studentName;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        System.out.println("Enter " + name + "'s score for test1");
        score1 = input.nextDouble();

        System.out.println("Enter " + name + "'s score for test2");
        score2 = input.nextDouble();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    public double getAverage()
    {
        return (score1 + score2) / 2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    public void printName()
    {
        System.out.print(name);
    }

    public String toString()
    {
        return "Name: " + name + "  Test1: " + score1 + "  Test2: " + score2;
    }
}

