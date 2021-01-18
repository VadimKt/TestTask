package Task6;

public class Item implements Comparable<Item>{
    private final int value;
    private final int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }


    public double theUnitCost() {
        return (double) value /(double) weight;
    }

    @Override
    public int compareTo(Item item) {
        if( theUnitCost() < item.theUnitCost()){
            return -1;
        }
        if (theUnitCost() > item.theUnitCost()){
            return 1;
        }
        return 0;
    }
}
