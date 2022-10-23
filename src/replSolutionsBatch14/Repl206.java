package Repl206;

import java.util.HashMap;
import java.util.Map;class Main {
    public static void main(String[] args) {
        Map<String,String> myMap=new HashMap<>();
        myMap.put("ONE","AAA");
        myMap.put("TWO","BBB");
        myMap.put("THREE","CCC");
        myMap.put("FOUR","DDD");
        myMap.put("FIVE","EEE");
        System.out.println("HashMap Before Remove :");
        myMap.forEach((X,Y)-> System.out.println(X+" : "+Y));
        System.out.println("------------------");
        myMap.remove("ONE");
        myMap.remove("FOUR");
        System.out.println("HashMap After Remove :");
        myMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}