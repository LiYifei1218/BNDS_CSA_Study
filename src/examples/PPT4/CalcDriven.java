package examples.PPT4;

public class CalcDriven {
    // declare some instance data with private visibility
    private int num1;
    private int num2;

    // constructor

    public CalcDriven(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // methods

    public int addition() {
        return num1 + num2;
    }
    public int subtraction() {
        return num1 - num2;
    }
    public int multiplication() {
        return num1 * num2;
    }
    public double division() {
        return (double) num1 / num2;
    }
}
