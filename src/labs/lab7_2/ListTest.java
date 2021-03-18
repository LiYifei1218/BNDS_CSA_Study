package labs.lab7_2;

// ****************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ****************************************************************

public class ListTest
{
    public static void main(String[] args)
    {
        IntList myList = new SortedIntList(10);
        ((UnSortedIntList) myList).ss();
        System.out.println(myList);
        myList.add(100);
        System.out.println(myList);
        myList.add(50);
        System.out.println(myList);
        myList.add(200);
        System.out.println(myList);
        myList.add(25);
        System.out.println(myList);
        myList.add(23);
        System.out.println(myList);
        myList.add(20);
        System.out.println(myList);
        myList.add(0);
        System.out.println(myList);
        myList.add(5);
        System.out.println(myList);
        myList.add(8848);
        System.out.println(myList);
        myList.add(-1);
        System.out.println(myList);
        myList.add(-3939);
        System.out.println(myList);
    }
}

