package labs.lab4_3;

public class TestNames {
    public static void main(String[] args) {

        Name name1 = new Name("Mary", "Jane", "Smith");
        Name name2 = new Name("Thomas", "O Ward", "Dent");

        System.out.println(name1.firstMiddleLast());
        System.out.println(name1.lastFirstMiddle());
        System.out.println(name1.initials());
        System.out.println(name1.length());

        System.out.println(name2.firstMiddleLast());
        System.out.println(name2.lastFirstMiddle());
        System.out.println(name2.initials());
        System.out.println(name2.length());

        System.out.println(name1.equals(name2));

    }
}
