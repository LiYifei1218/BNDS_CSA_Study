package labs.lab5_2;

public class Shopping {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(3);
        Item i = new Item("Apple", 2.5, 3);
        cart.addToCart(i);
        cart.addToCart(i);
        cart.addToCart(i);
        cart.addToCart(i);
        System.out.println(cart);

    }
}
