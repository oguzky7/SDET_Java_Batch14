package HomeWorks;

import java.util.ArrayList;
import java.util.Iterator;

public class class25_HW3_10_30_2022 {
    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        for (int i = 0; i<=500; i+=2){
            evenNumbers.add(i);
        }
        Iterator<Integer> iterateEven = evenNumbers.iterator();
        while(iterateEven.hasNext()){
            int x = (Integer)iterateEven.next();
            if(x % 5 == 0){
                iterateEven.remove();
            }
        }
        System.out.print(evenNumbers+" ");
        // oguzky7
    }
}
