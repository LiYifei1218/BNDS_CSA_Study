package labs.lab5_4;

// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class Shop
{
    public static void main (String[] args)
    {

        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        ArrayList<Item> cart = new ArrayList<Item>();

        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.next();

            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();

            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();

            // *** create a new item and add it to the cart

            cart.add(new Item(itemName, itemPrice, quantity));

            // *** print the contents of the cart object using println

            for (int i = 0; i < cart.size(); i++) {
                System.out.println(cart.get(i));
            }

            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.next();
        }
        while (keepShopping.equals("y"));

        System.out.println("\t\t\tShopping Cart\nItem\tUnit Price\tQuantity\tTotal\n");
        double total = 0;

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i));
            total += (cart.get(i).getPrice() * cart.get(i).getQuantity());
        }
        System.out.println("\n\nTOTAL: " + total);
    }
}
