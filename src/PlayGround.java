import java.util.*;

public class PlayGround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += input.nextInt();
        }
        System.out.println(sum / 10);
    }
}
