package labs.lab5_2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(0);

        Scanner input = new Scanner(System.in);
        String flag;

        do {
            System.out.println("Enter the name, price and quantity:");

            Item i = new Item(input.next(), input.nextDouble(), input.nextInt());
            cart.addToCart(i);
            System.out.println(cart);
            System.out.println("Another item? (y/n)");

            flag = input.next();
        } while (flag.equalsIgnoreCase("y"));
    }
}
