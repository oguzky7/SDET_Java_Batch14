package Practise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class repl_217_2 {
        public static ArrayList<Integer> itemsToBeRemoved = new ArrayList<>();
        public static int dupCount;

    public static void main(String[] args) {
        System.out.println("Hello World");
        List<Integer> deneme = new ArrayList<>();
        deneme.add(12);
        deneme.add(12);
        deneme.add(13);
        deneme.add(45);
        deneme.add(78);
        deneme.add(7);
        deneme.add(7);

        System.out.println(deneme);
        System.out.println(countDuplicates(deneme));
        System.out.println(itemsToBeRemoved);
        System.out.println();
        System.out.println(deneme.get(0));
    }


    static int countDuplicates(List<Integer> numbers) {



        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j < numbers.size(); j++) {
                if (numbers.get(i) != numbers.get(j)) {
                    itemsToBeRemoved.add(numbers.get(i));
                    //dupCount++;
                    break;
                }//else if()
            }
        }
        numbers.removeAll(itemsToBeRemoved);
        return numbers.size();
    }

}

