package Repl202;

import java.util.Map;
import java.util.TreeMap;
class Main {
    public static void main(String[] args){
        Map<Integer,String> myMap=new TreeMap<>();
        myMap.put(1, "apple");
        myMap.put(2, "banana");
        myMap.put(3, "pear");
        myMap.put(4, "tomato");
        myMap.put(5, "mango");
        myMap.put(6, "kiwi");
        //using functional programming
      //  myMap.forEach((key,value)-> System.out.println("Key is "+key+" item and values is "+value));

        for (Map.Entry<Integer, String> entry : myMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is " + key + " item and values is " + value);
        }
    }

}