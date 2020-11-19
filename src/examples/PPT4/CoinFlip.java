package examples.PPT4;

public class CoinFlip {
    public static void main (String[] args){
        Coin myCoin = new Coin(); // create the object of the Coin class
        myCoin.flip(); // flip the coin to see the result
        System.out.println(myCoin); // print the results according to toString method
        if (myCoin.isHeads()){
            System.out.println("You WIN, congratulations!");
        }
        else {
            System.out.println("Sorry, better luck next time!");
        }
    }
}
