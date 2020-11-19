package friday;

public class Star {
    public static void main(String[] args) {
        int num = 10;
        // a
        for (int i = 0; i < num; i++) {
            String line = "";
            line += "*".repeat(num - i);
            System.out.println(line);
        }
        System.out.println();

        //b
        for (int i = 0; i < num; i++) {
            String line = "";
            line += " ".repeat(num - i - 1);
            line += "*".repeat(i + 1);
            System.out.println(line);
        }
        System.out.println();

        //c
        for (int i = 0; i < num; i++) {
            String line = "";
            line += " ".repeat(i);
            line += "*".repeat(num - i);
            System.out.println(line);
        }
        System.out.println();

        //d
        for (int i = (num) / 2; i >= 0; i--) {
            String line = "";
            line += " ".repeat(i);
            line += "*".repeat(num - i * 2);
            System.out.println(line);
        }
        for (int i = 0; i < (num + 1) / 2; i++) {
            String line = "";
            line += " ".repeat(i);
            line += "*".repeat(num - i * 2);
            System.out.println(line);
        }
    }
}
