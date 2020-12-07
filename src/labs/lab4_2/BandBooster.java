package labs.lab4_2;

public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String str) {
        name = str;
        boxesSold = 0;
    }

    public String getName() {
        return name;
    }

    public void updateSales(int num) {
        boxesSold += num;
    }

    public String toString() {
        return name + ": " + boxesSold;
    }
}
