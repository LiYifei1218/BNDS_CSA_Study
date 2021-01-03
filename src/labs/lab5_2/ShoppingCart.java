package labs.lab5_2;

import java.util.Arrays;

public class ShoppingCart {

    private Item[] cart;
    private int capacity;
    private int itemCount;
    private double totalPrice;

    public ShoppingCart(int C) {
        capacity = C;
        cart = new Item[capacity];
        itemCount = 0;
        totalPrice = 0;
    }

    private void increaseSize() {
        Item[] newArr = new Item[cart.length + 3];
        for (int i = 0; i < cart.length; i++) {
            newArr[i] = cart[i];
        }
        cart = newArr;
    }

    public void addToCart(Item item) {
        if (itemCount == cart.length)
            increaseSize();
        cart[itemCount] = item;

        itemCount ++;
        totalPrice += item.getPrice() * item.getQuantity();
    }

    public String toString() {
        String rtn = "\t\t\tShopping Cart\nItem\tUnit Price\tQuantity\tTotal\n";
        for (int i = 0; i < itemCount; i++) {
            rtn += cart[i].toString() + "\n";
        }
        rtn += "\nTotal Price of cart: $" + totalPrice;
        return rtn;
    }
}
