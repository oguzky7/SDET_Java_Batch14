package HomeWorks;

import java.util.ArrayList;

public class class24_HW1_10_29_2022 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kaan");
        names.add("Koray");
        names.add("Oguz");
        names.add("Sevgi");
        names.add("Sevim");
        System.out.println("Array is empty: "+names.isEmpty());
        System.out.println(names.contains("Oguz"));

        for (String name : names) {
            if (name == "Oguz") {
                System.out.println("'Oguz' in the list of Array.");
            }
        }
        System.out.println("Array size is "+names.size());
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(names);
        //oguzky7
    }
}
