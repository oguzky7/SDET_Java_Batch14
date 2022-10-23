package Repl200;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        Map<String, String> myMap = new LinkedHashMap<>();
        myMap.put("Street", "Patrick ST");
        myMap.put("Suite", "265");
        myMap.put("City", "Vienna");
        myMap.put("Zip", "22180");
        myMap.put("Country", "United State");

        Iterator<Map.Entry<String, String>> iterator=myMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String>entry=iterator.next();
            System.out.println(entry.getValue());
        }
        // lambda expression
        // myMap.forEach((A, B) -> System.out.println(B));
        // stream
        // myMap.entrySet().stream().forEach(x-> System.out.println(x.getValue()));
    }
}

