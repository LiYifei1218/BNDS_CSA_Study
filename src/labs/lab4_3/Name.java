package labs.lab4_3;

public class Name {
    String first;
    String middle;
    String last;

    public Name(String f, String m, String l) {
        first = f;
        middle = m;
        last = l;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }

    public boolean equals(Name otherName) {
        return otherName.last.equalsIgnoreCase(last)
                && otherName.middle.equalsIgnoreCase(middle)
                && otherName.first.equalsIgnoreCase(first);
    }

    public String initials() {
        return (first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1)).toUpperCase();
    }

    public int length() {
        String full = first + middle + last;
        int countSpace = 0;
        int len = full.length();
        for (int i = 0; i < len; i++) {
            if (full.charAt(i) == ' ')
                countSpace++;
        }
        return len - countSpace;
    }

}
