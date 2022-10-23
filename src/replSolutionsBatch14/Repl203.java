package Repl203;

import java.util.*;
class Main {
    public static void main(String[] args){
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("mango",10);
        myMap.put("apple",30);
        myMap.put("orange",20);
        myMap.put("mango",40);
        myMap.put("mango",40);
        Iterator<Map.Entry<String,Integer>> it=myMap.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            System.out.println("Key = "+entry.getKey()+" and value = "+entry.getValue());
        }
        // lambda
        // myMap.forEach((X,Y)-> System.out.println("Key = "+X+" and value = "+Y));
        // stream
        // myMap.entrySet().stream().forEach(A-> System.out.println("Key = "+A.getKey()+" and value = "+A.getValue()));
    }
}