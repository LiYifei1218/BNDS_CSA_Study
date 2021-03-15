package labs.lab7_2;

public class SortedIntList extends IntList{
    public SortedIntList(int size) {
        super(size);
    }

    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else
        {
            int loc = 0;
            int i = 0;
            while (list[i] < value && i < numElements) {
                loc = i + 1;
                i++;
            }

            for (i = numElements; i > loc; i--) {
                list[i] = list[i - 1];
            }

            list[loc] = value;
            numElements++;
        }
    }

}
