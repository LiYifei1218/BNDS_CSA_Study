package labs.lab7_1;

// ****************************************************************
// Yorkshire.java
//
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// ****************************************************************

public class Yorkshire extends Dog
{
    private static int breedWeight = 60;
    public Yorkshire(String name)
    {
        super(name);
    }

    public int avgBreedWeight() {
        return breedWeight;
    }

    // ------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }

}

