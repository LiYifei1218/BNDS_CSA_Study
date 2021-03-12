package labs.lab7_1;

// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        // Dog dog = new Dog("Spike");
        // System.out.println(dog.getName() + " says " + dog.speak());
        Labrador dog1 = new Labrador("Simpson", "green");
        System.out.println(dog1.getName() + " says " + dog1.speak());
        System.out.println(dog1.avgBreedWeight());
        //System.out.println();
        Yorkshire dog2 = new Yorkshire("Jackson");
        System.out.println(dog2.getName() + " says " + dog2.speak());
        System.out.println(dog2.avgBreedWeight());
    }
}