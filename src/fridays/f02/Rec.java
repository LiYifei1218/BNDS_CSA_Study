package fridays.f02;
import java.util.*;
public class Rec {
    public static void main(String[] args) {
        int l, w;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input the width of the rectangle: ");
        l = input.nextInt();
        System.out.print("Please input the breadth of the rectangle: ");
        w = input.nextInt();

        System.out.println("The perimeter is: " + ((l + w) * 2) + ", the area is: " + (l * w));
    }
}
