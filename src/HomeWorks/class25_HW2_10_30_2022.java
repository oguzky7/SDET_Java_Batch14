package HomeWorks;

import java.util.ArrayList;

public class class25_HW2_10_30_2022 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Wine");
        drinks.add("Coffee");
        drinks.add("Milk");
        drinks.add("Lemonade");
        drinks.add("Iced tea");
        drinks.add("Juice");
        drinks.add("Milkshake");
        drinks.add("Coconut");
        drinks.add("Beer");

        for (int i = 0; i<drinks.size(); i++){
            if (drinks.get(i).contains("a") || drinks.get(i).contains("E") || drinks.get(i).contains("e") || drinks.get(i).contains("A")){
                drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
        //oguzky7
    }
}
