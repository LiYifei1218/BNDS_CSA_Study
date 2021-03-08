package examples.ppt6;

// this will be the driven class
public class Coin {
    private final int HEADS = 0; // private keyword makes it unaccessible outside this class
    private final int TAILS = 1;
    private int face; //instance data of the class, applicable to all objects of the Coin class

    // constructor has the same name as the class name (ALWAYS)
    // constructor is used to initialize the object of the class, give some intial value to instance data
    public Coin(){
        flip();
    }
    // method declaration
    public void flip(){ // flip the coin, void is the return type of this method, means return nothing
        face = (int)(Math.random() * 2); // face will either be 1 or 0
    }
    public boolean isHeads(){ // boolean is the return type of this method, returns either True or false
        return (face == HEADS);
    }
    public String toString(){ // return type is String, returns a string
        String faceName; // local variable because it is declared inside a method, inaccessible outside
        if (face == HEADS){
            faceName = "Heads";
        }
        else {
            faceName = "Tails";
        }
        return faceName;
    }

}