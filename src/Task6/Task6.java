package Task6;


import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        final Item item1  = new Item(1,2);
        final Item item2 = new Item(5,2);
        final Item item3 = new Item(3,6);
        final Item item4 = new Item(4,2);
        final Item item5 = new Item(1,3);

        final int tonnage = 10;

        ArrayList<Item>items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.sort(Item::compareTo);
        Collections.sort(items,Collections.reverseOrder());


        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while (currentItem<items.size() && weightSoFar<=tonnage){
            if(weightSoFar + items.get(currentItem).getWeight() < tonnage ){
                valueSoFar += items.get(currentItem).getValue();
                weightSoFar += items.get(currentItem).getWeight();
            }
            currentItem++;
        }
        System.out.println("Сумарная стоймость предметов в рюкзаке: " + valueSoFar);
        System.out.println("Занято веса рюкзака: " + weightSoFar + " из " + tonnage);



    }

}

