package examples.ppt6;

// this will be the driven class
public class Coin implements Lockable{
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
        if (isLocked)
            System.out.println("Object Locked!");
        else
            face = (int)(Math.random() * 2); // face will either be 1 or 0
    }
    public boolean isHeads(){ // boolean is the return type of this method, returns either True or false
        if (isLocked) {
            System.out.println("Object Locked!");
            return false;
        }
        else
            return (face == HEADS);
    }
    public String toString(){ // return type is String, returns a string
        if (isLocked) {
            System.out.println("Object Locked!");
            return "Locked";
        }
        else {
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


    private int KEY;
    private boolean isLocked;

    public void setKey(int key) {
        KEY = key;
    }

    public void lock(int key) {
        if (key == KEY) {
            isLocked = true;
            System.out.println("Locked!");
        }
        else
            System.out.println("Key Error!");
    }

    public void unlock(int key) {
        if (key == KEY) {
            isLocked = false;
            System.out.println("Unlocked");
        }
        else
            System.out.println("Key Error!");
    }

    public boolean locked() {
        return isLocked;
    }
}