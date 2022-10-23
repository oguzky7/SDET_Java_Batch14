package Repl207;

import java.util.*;
import java.util.Map.Entry;

class Main {
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("ONE","AAA");
        myMap.put("TWO","BBB");
        myMap.put("THREE","CCC");
        myMap.put("FOUR","DDD");
        myMap.put("FIVE","EEE");
        System.out.println("HashMap Before Replace :");
        Iterator<Entry<String,String>> iterator=myMap.entrySet().iterator();
        while (iterator.hasNext()){
            Entry<String,String>it=iterator.next();
            System.out.println(it.getKey()+" : "+it.getValue());
        }
        System.out.println("------------------");
        myMap.replace("THREE",  "ASEL");
        myMap.replace("FIVE", "SUMAIR");
        System.out.println("HashMap After Replace :");
        myMap.forEach((X,Y)-> System.out.println(X+" : "+Y));
    }
}