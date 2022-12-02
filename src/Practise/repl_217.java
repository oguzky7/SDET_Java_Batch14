package Practise;

//import org.apache.poi.ss.formula.functions.T;

import java.util.*;
import java.util.List;

public class repl_217 {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);

        list.clear();
        list.addAll(set);

        return list;
    }

    public static void main(String args[]) {

        // Get the ArrayList with duplicate values
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: " + list);

        // Remove duplicates
        ArrayList<Integer>
                newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);
    }
}
//    public static ArrayList<Integer> itemsToBeRemoved = new ArrayList<>();
//    public static ArrayList<Integer> itemsToBeRemoved = new ArrayList<>();
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        List<Integer> deneme = new LinkedList<>();
//        deneme.add(12);
//        deneme.add(12);
//        deneme.add(13);
//        deneme.add(45);
//        deneme.add(78);
//        deneme.add(7);
//        deneme.add(7);
//
//        System.out.println(deneme);
//        System.out.println(countDuplicates(deneme));
//        System.out.println(itemsToBeRemoved);
//    }
//
//    static int countDuplicates(List<Integer> numbers) {
//
//
//
//        for (int i = 0; i < numbers.size(); i++) {
//            for (int j = i+1; j < numbers.size(); j++) {
//                if (numbers.get(i) == numbers.get(j)) {
//                    itemsToBeRemoved.add(numbers.get(i));
//
//                }//else if()
//            }
//        }
//        numbers.removeAll(itemsToBeRemoved);
//        return numbers.size();
//    }


