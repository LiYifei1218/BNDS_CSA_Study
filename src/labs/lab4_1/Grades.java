package labs.lab4_1;

// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        student1.inputGrades();
        System.out.println("The average of ");
        student1.printName();
        System.out.println(" is " + student1.getAverage());

        System.out.println();

        student2.inputGrades();
        System.out.println("The average of ");
        student2.printName();
        System.out.println(" is " + student2.getAverage());

        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);

    }
}

