package Repl208;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
class Main {
    public static void main(String[] args) {
        Map<String,Integer> myMap=new HashMap<>();
        myMap.put("mango", 10);
        myMap.put("apple", 30);
        myMap.put("orange", 20);
        Display(myMap);
        myMap.clear();
        Display(myMap);
    }
    static void Display(Map<String,Integer> myMap){
        if(myMap.isEmpty()){
            System.out.println("map is empty");
        }else {
            Iterator<Map.Entry<String,Integer>>iterator=myMap.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Integer>it=iterator.next();
                System.out.println(it.getKey()+" : "+it.getValue());
            }
        }
    }
}