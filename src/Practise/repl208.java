package Practise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class repl208 {

    static void Display(Map<String,Integer> map){
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else if(!map.isEmpty()) {
            Iterator<Map.Entry<String,Integer>>iterator=map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Integer>it=iterator.next();
                System.out.println(it.getKey()+" : "+it.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);
        Display(map);
        map.clear();
        Display(map);


    }
    }


